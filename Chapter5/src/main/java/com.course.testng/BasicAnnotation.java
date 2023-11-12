package com.course.testng;


import org.testng.annotations.*;

/**
 * @author: fish
 * @create: 2023-11-07 10:38
 **/
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("测试用例1 @Test" );
    }

    @BeforeClass
    public void testCase2(){
        System.out.println("这是测试用例2 @BeforeClass");
    }

    @BeforeMethod
    public void testCase3(){
        System.out.println("这是测试用例3 @BeforeMethod");
    }

    @BeforeSuite
    public void testCase4(){
        System.out.println("这是测试用例4 @BeforeSuite");
    }

    @AfterClass
    public void testCase5(){
        System.out.println("这是测试用例5 @AfterClass");
    }

    @AfterMethod
    public void testCase6(){
        System.out.println("这是测试用例6 @AfterMethod");
    }

    @AfterSuite
    public void testCase7(){
        System.out.println("这是测试用例7 @AfterSuite");
    }

    @BeforeTest
    public void testCase8(){
        System.out.println("这是测试用例8 @BeforeTest");
    }

    @AfterTest
    public void testCase9(){
        System.out.println("这是测试用例9 @AfterTest");
    }

    @Test
    public void testCase10() {
        System.out.println("这是测试用例10 @Test");
    }
}
