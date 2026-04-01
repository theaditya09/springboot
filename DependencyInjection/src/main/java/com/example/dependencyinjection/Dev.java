package com.example.dependencyinjection;

//by using the annotation @Component spring says that ill manage the obj lifecycle for this class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    // now the application context is not available here so we use another keyword @Autowired

    @Autowired //field injection
    @Qualifier("laptop")
    private Computer comp;

//    constructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    setter injection
//    @Autowired
//    public void setter(Laptop laptop){
//        this.laptop = laptop;
//    }



    public void build(){
        comp.compile();
        System.out.println("working on an awesome project!!");
    }
}
