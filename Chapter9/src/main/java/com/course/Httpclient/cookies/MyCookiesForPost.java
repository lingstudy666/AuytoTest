package com.course.Httpclient.cookies;

import jdk.nashorn.internal.runtime.JSONFunctions;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author: fish
 * @create: 2023-11-15 18:10
 **/
public class MyCookiesForPost {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;

    @BeforeClass
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        //从配置文件中进行url拼接
        String uri = bundle.getString("getCookies.uri");
        String testUrl = url + uri;

        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        String result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookies信息
        store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();
        for (Cookie cookie : cookieList) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookieName:" + name + "; cookieVaule:" + value);
        }
    }

    @Test(dependsOnMethods = "testGetCookies")
    public void testPostWithCookies() throws IOException {
        String uri = bundle.getString("test.post.with.cookie.uri");
        String testurl = url + uri;

        //声明一个post方法
        HttpPost post = new HttpPost(testurl);
        //声明一个client对象，来执行方法
        DefaultHttpClient client = new DefaultHttpClient();

        //设置请求头，设置header
        post.setHeader("content-type","application/json");

        //添加参数
        JSONObject param = new JSONObject();
        param.put("name","huhansan");
        param.put("age","18");

        //将参数放到请求中
        StringEntity stringEntity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(stringEntity);

        //设置cookies信息
        client.setCookieStore(store);

        //声明一个对象来接收请求响应结果
        HttpResponse response = client.execute(post);

        //响应结果判断
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

        //将response转换为json
        JSONObject resultJson = new JSONObject(result);

        //获取响应结果具体值
        String rName = String.valueOf(resultJson.get("name"));
        String rAge = String.valueOf(resultJson.get("age"));
        Assert.assertEquals(rName,"你真棒");
        Assert.assertEquals(rAge,"111");

    }

}
