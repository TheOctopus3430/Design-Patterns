package com.example.callback.demo1;

public class Caller {

    public void testCallBack(final CallBackInf callBackInf, String param) {
        //执行B的主任务
        System.out.println("B任务开始执行");
        //一般采用异步的方式执行A的回调
        new Thread(() -> {
            System.out.println("开始执行回调");
            callBackInf.call();
        }).start();
    }
}
