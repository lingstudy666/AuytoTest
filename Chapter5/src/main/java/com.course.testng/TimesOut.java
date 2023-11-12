package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author: fish
 * @create: 2023-11-10 11:20
 **/
public class TimesOut {
    @Test(timeOut = 3000)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
    }
}
