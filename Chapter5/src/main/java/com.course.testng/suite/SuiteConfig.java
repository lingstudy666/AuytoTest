package com.course.testng.suite;

import org.testng.annotations.*;

/**
 * @author: fish
 * @create: 2023-11-08 13:40
 **/
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite 运行了");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite 运行了");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest 运行了");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest 运行了");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass 运行了");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass 运行了");
    }
}
