package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author: fish
 * @create: 2023-11-08 14:09
 **/


public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是在服务端组运行之前运行的测试方法aaaaa");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是在服务端组运行之后运行的测试方法bbbbb");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是在客户端组运行之前运行的测试方法ccccc");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是在客户端组运行之后运行的测试方法ddddd");
    }
}
