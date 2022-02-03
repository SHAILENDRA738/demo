package com.project1.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class List_Crud_Controller<index> {
        ArrayList<String>courselist= new ArrayList<>();
        //CREATE AND ADD ENDPOINT
    @RequestMapping("/add_to_list")
    public String add (@RequestParam String element){
        courselist.add(element);
        return "Add Successfully"+element;
    }
    //READ OR GET ENDPOINT
@RequestMapping("/get_course_list")
    public ArrayList<String> getCourselist() {
        return courselist;
    }
    //UPDATE ENDPOINT
    @RequestMapping("/update")
    public String update( @RequestParam String element,@RequestParam int index){
        courselist.set(index,element);
        return "element updated"+element;
    }
    //DELETE or REMOVE ENDPOINT
    @RequestMapping("/remove")
    public String remove (@RequestParam int index){
        courselist.remove(index);
        return "element removed successfully";
    }
}
