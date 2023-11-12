package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author: fish
 * @create: 2023-11-10 09:59
 **/
public class DataProvideTest {

    @Test(dataProvider = "data")
    public void dataTest(String name,int age){
        System.out.println("不区分方法的数据，name = " +name+"，age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30},
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void methodTest1(String name,int age){
        System.out.println("区分方法methodTest1的name = " +name+"，age="+age);
    }

    @Test(dataProvider = "methodData")
    public void methodTest2(String name,int age){
        System.out.println("区分方法methodTest2的name = " +name+"，age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodData(Method method){
        Object[][] o = null;
        if(method.getName().equals("methodTest1")){
            o = new Object[][]{
                    {"可乐",1},
                    {"小呱呱",2}
            };
        }else if(method.getName().equals("methodTest2")){
            o = new Object[][]{
                    {"周杰伦",47},
                    {"蔡依林",43}
            };
        }
        return o;
    }

}
