package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author: fish
 * @create: 2023-11-08 15:16
 **/
public class ParamTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("姓名：" + name + "； 年龄：" + age);
    }
}
