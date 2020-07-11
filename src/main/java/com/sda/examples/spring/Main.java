package com.sda.examples.spring;

import com.sda.examples.spring.beans.MyBean;
import com.sda.examples.spring.components.SecondBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        MyBean myBean = ctx.getBean(MyBean.class);
        myBean.someMethod();

        SecondBean secondBean = ctx.getBean(SecondBean.class);
        secondBean.doSomeAction();
    }

}
