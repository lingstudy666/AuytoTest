package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author: fish
 * @create: 2023-11-08 14:54
 **/
public class DpendensOnMethod {

    @Test
    public void test1(){
        System.out.println("test111111");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test222222");
    }
}
