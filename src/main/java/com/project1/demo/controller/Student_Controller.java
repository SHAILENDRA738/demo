package com.project1.demo.controller;

import com.project1.demo.modal.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController

public class Student_Controller {
    ArrayList<Student>studentArrayList=new ArrayList<>();
@RequestMapping("/add_student")
    public String add(){
        Student student1=new Student("Sha",33,"cs");
                studentArrayList.add(student1);
        return "Student Added Successfully";
    }
 @RequestMapping("/get_student")
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
    @RequestMapping("update_student")
    public String udate(@RequestParam int age){
    studentArrayList.get(0).setAge(age);
    return "Name Update Successfully "+age;

    }
    @RequestMapping("delete_student")
    public String remove( @RequestParam int index){
    studentArrayList.remove(index);
    return "Element Removed Successfully";
    }
}
