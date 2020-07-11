package com.sda.examples.spring.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

//@Component
public class MyBean {

    private static final Logger logger = LogManager.getLogger(MyBean.class);

    public void someMethod(String someText){
        logger.debug(someText == null ? "Calling some method in MyBean" : someText);
    }

    public void someMethod(){
        someMethod(null);
    }
}
