package com.project1.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Path_Variable_Demo {

    @RequestMapping("/AND/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b) {

        int sum = a + b;
        return "addition of a and is:" + sum;
    }

    @RequestMapping("/SUB/{a}/{b}")
    public String subtraction(@PathVariable int a, @PathVariable int b) {
        int result = a - b;
        return "subtraction of a and b is:" + result;
    }

    @RequestMapping("/MUL/{a}/{b}")
    public String multipule(@PathVariable int a, @PathVariable int b) {
        int result = a * b;
        return "mutlipule of a and b is" + result;
    }

    @RequestMapping("/DIV/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b) {
        int result = b / a;
        return "divide of a and is" + result;
    }
}