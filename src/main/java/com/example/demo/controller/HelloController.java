package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC_01
    //GET Request - Responds with "Hello from BridgeLabz"
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC_02
    //GET Request with Query Parameter - Responds with "Hello <name> from BridgeLabz"
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //UC_03 - Using Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //UC_04- POST Request - Accepts firstName and lastName in the body
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    //UC_05- PUT Request - pass first name as Path Variable & last name as Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
