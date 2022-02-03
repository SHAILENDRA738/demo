package com.project1.demo.controller;

import com.project1.demo.modal.Employee;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

public class Employee_Repsitory_Demo {
    ArrayList<Employee> employeesArrayList=new ArrayList<Employee>();
    @RequestMapping("/add_employees")
    public String add(){

        return "Emplyees Add Sucessfully";
    }
}
