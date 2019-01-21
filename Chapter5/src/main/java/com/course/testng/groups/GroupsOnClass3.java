package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void stu1(){
        System.out.println("class3中的stu1运行111");
    }

    public void stu2(){
        System.out.println("class3中的stu2运行222");
    }
}
