package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

/**
 * @author: fish
 * @create: 2023-11-11 15:19
 **/
public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","bbb");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是自己写的日志");
        throw new RuntimeException("这是运行抛出的异常");
    }
}
