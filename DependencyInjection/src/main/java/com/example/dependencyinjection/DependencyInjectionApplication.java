package com.example.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        //now if the class dev has a non-static method build we need to create an object to call that method.
        //manual way of creating an object
//        Dev d = new Dev();
//        d.build();

        //now we have to get the reference of the ioc container inside the jvm which is of the type application context

        Dev d_with_di = context.getBean(Dev.class);
        d_with_di.build();
    }

}
