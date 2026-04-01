package com.example.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs");
    }

    public void debug(){
        System.out.println("debugging line by line");
    }
}
