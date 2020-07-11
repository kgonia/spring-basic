package com.sda.examples.spring;

import java.io.Serializable;

public class Elvis {

    private static Elvis INSTANCE;

    private Elvis() {
    }

    public static synchronized Elvis getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Elvis();
        }
        return INSTANCE;
    }
}
