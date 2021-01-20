package com.training.etiya.rest;

import java.security.SecureRandom;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/test1/{abc}/soy/{xyz}")
    public String test1(@PathVariable("abc") final String name,
                        @PathVariable("xyz") final String surname) {
        return "hello world " + name + " " + surname;
    }

    @GetMapping("/test2")
    public String test2(@RequestParam("abc") final String name,
                        @RequestParam("xyz") final String surname) {
        int iVal = 100;
        System.out.println("Test : abc " + iVal);
        return "hello world 2a " + name + " " + surname;
    }

    @GetMapping("/test3")
    public String test3(@RequestHeader("abc") final String name,
                        @RequestHeader("xyz") final String surname) {
        return "hello world 3 " + name + " " + surname;
    }

    @PostMapping("/test4")
    public String test4(@RequestBody final Person person) {
        return "hello world  " + person;
    }

    @PostMapping(value = "/test5",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Person test5(@RequestBody final Person person) {
        person.setName("Person-" + new SecureRandom().nextInt());
        return person;
    }


    @GetMapping("/hello1")
    public String hello1g() {
        return "hello world GET";
    }

    @PostMapping("/hello1")
    public String hello1p() {
        return "hello world POST";
    }

    @PatchMapping("/hello1")
    public String hello1pa() {
        return "hello world PATCH";
    }

    @PutMapping("/hello1")
    public String hello1pu() {
        return "hello world PUT";
    }

    @DeleteMapping("/hello1")
    public String hello1d() {
        return "hello world DELETE";
    }

}
