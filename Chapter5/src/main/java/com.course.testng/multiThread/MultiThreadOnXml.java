package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author: fish
 * @create: 2023-11-10 10:24
 **/
public class MultiThreadOnXml {
    @Test
    public void mTest1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void mTest2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
