package com.ashwani.springsecurity.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created 12/12/2022
 */
@RestController
public class ResourceController {
    @GetMapping()
    public String hello(){
        return "<h1>Hello World</h2>";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "<h1>Hello User</h2>";
    }
    @GetMapping("/admin")
    public String helloAdmin(){
        return "<h1>Hello Admin</h2>";
    }

}
