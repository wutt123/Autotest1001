package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.printf("这是服务端组的测试方法1111");

    }

    @Test(groups = "server")
    public void test2(){
        System.out.printf("这是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.printf("这是客户端组的测试方法1111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.printf("这是客户端组的测试方法2222");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.printf("这是服务端组运行之前运行的测试方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.printf("这是服务端组运行之后运行的测试方法");
    }
}
