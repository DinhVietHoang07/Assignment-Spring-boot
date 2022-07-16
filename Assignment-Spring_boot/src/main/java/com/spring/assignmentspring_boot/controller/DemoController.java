package com.spring.assignmentspring_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(String name){
        return "Hello world, " + name;
    }
}
