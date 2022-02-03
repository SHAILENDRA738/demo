package com.project1.demo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Request_Param_Demo {
        @RequestMapping("/and")
        public String addition(@RequestParam int a, @RequestParam int b) {
            int sum = a + b;
            return "addition of a and is:" + sum;
        }

        @RequestMapping("/sub")
        public String subtraction(@RequestParam int a, @RequestParam int b) {
            int result = a - b;
            return "subtraction of a and b is:" + result;
        }

        @RequestMapping("/mul")
        public String multipule(@RequestParam int a, @RequestParam int b) {
            int result = a * b;
            return "multipule of a and b is" + result;
        }

        @RequestMapping("/div")
        public String divide(@RequestParam int a,@RequestParam int b) {
            int result = b / a;
            return "divide of a and is" + result;
        }
    }

