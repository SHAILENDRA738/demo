package com.project1.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

  @RestController

   public class Day_1_DemoController{
   //ENDPOINT1
   @RequestMapping("/HELLO")
   public void hello() {
    System.out.println("Hello From Spring Boot");
   }

    //ENDPOINT2
    @RequestMapping("/message")
    public String message(){
     return "Hello, This is from spring boot";


    }

   }


