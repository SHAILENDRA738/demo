package com.project1.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController{
    @RequestMapping("/AND")
    public String addition() {
        int a = 4;
        int b = 5;
        int sum = a + b;
        return "addition of a and is:" +sum;
    }
    @RequestMapping("/SUB")
        public String subtraction() {
        int a = 40;
        int b = 20;
        int result = a - b;
        return "subtraction of a and b is:" + result;
    }
        @RequestMapping("/MUL")
        public String multipule() {
            int a = 4;
            int b = 8;
            int result = a * b;
            return "mutlipule of a and b is" + result;
        }
        @RequestMapping("/DIV")
            public String divide() {
            int a = 8;
            int b = 64;
            int result = b / a;
            return "divide of a and is" + result;
        }

        }


