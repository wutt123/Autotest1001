package com.course.testng;

import org.testng.annotations.*;

public class BaseAnnotation {

    @Test
    public void testcase1(){
        System.out.println("这是测试用例1");

    }

    @Test
    public void testcase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是在方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是在方法之后运行");

    }

    @BeforeClass
    public void beforeClass(){

    }
    @AfterClass
    public void afterClass(){

    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.printf("BeforeSuite");

    }

    @AfterSuite
    //类属于某个测试套件下的
    public void afterSuite(){
        System.out.printf("AfterSuite");

    }



}
