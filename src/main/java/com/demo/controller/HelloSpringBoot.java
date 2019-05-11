package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @RequestMapping(path = {"/helloSpringBoot"})
    public String HelloSpring (){
        System.out.println("hello spring boot");
        return "hello spring boot";
    }

    @RequestMapping(path = {"/helloSpringBoot1"})
    public String HelloSpring1 (){
        System.out.println("hello spring boot");
        return "hello spring boot1";
    }
}