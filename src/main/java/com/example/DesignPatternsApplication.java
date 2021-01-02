package com.example;

import com.example.callback.demo5.MyEvent;
import com.example.callback.demo5.MyListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DesignPatternsApplication.class, args);
        //装载事件
        context.addApplicationListener(new MyListener());
        //发布事件
        context.publishEvent(new MyEvent("测试事件."));
    }

}
