package com.sda.examples.spring.components;

import com.sda.examples.spring.beans.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    private final MyBean myBean;

    @Autowired
    public SecondBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public void doSomeAction(){
        this.myBean.someMethod("This is text from second Bean");
    }
}
