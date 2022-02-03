package com.project1.demo.controller;

import com.project1.demo.modal.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Employee_Controller {
    ArrayList<Employee>employeesArrayList=new ArrayList<Employee>();
    @RequestMapping("/add_employees")
    public String add(){
        Employee employees1=new Employee("Shailendra",33,"Udaan");
        Employee employees2=new Employee("Abhishek",24,"TCS");
        Employee employees3=new Employee("Himanshu", 27,"Wipro");
        Employee employees4=new Employee("Uttam",32,"Bluedart");
        Employee employees5=new Employee("Vanshu",26,"Contrix");

        employeesArrayList.add(employees1);
        employeesArrayList.add(employees2);
        employeesArrayList.add(employees3);
        employeesArrayList.add(employees4);
        employeesArrayList.add(employees5);
        return "Emplyees Add Sucessfully";
    }
 @RequestMapping("/get_employees")
    public ArrayList<Employee> getEmployeesArrayList() {
        return employeesArrayList;
     }
}
