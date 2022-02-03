package com.project1.demo.modal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

    @Entity
    public class Employee {
        @Id
        @GeneratedValue // Automatically increment current 0,1,2,3,......14,15
        Long id;// primary key unique value

     String name;
    int age;
    String company;

    public Employee(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

        public Employee() {
        }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}



