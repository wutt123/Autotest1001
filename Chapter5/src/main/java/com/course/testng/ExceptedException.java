package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {
    /**
     *什么时候会用到异常测试？
     * 在期望结果为某个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 也就是我们预期的结果就是这个异常
     */

    //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void renTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个测试结果成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void renTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();

    }
}
