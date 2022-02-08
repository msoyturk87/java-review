package com.cydeo;



import com.cydeo.core.Loops;
import com.cydeo.core.Methods;
import com.cydeo.core.SelectionStatements;
import com.cydeo.oop.abstraction.implementation.UserServiceImplementation;
import com.cydeo.oop.abstraction.service.UserService;
import com.cydeo.oop.encapsulation.Role;
import com.cydeo.oop.encapsulation.User;
import com.cydeo.oop.inheritance.BaseEntity;
import com.cydeo.oop.inheritance.Project;
import com.cydeo.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        //*******CORE*******//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(6));
        Methods.methodC();

        Loops.demoForIterator();
        Loops.demoForEach();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        //*******OOP-Encapsulation*******//
        User user = new User("Mike","Smith",new Role(2,"Manager"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //*******OOP-Inheritance*******//
        Project project = new Project(1,LocalDateTime.now(),1,LocalDateTime.now().minusHours(5),1,"PRJ001", "Human Resource CRM",
                new User("Mike","Smith",new Role(1,"Manager")),
                LocalDate.now(),LocalDate.now().plusMonths(6),"IN_PROGRESS","HCRM Detail Information");
        //*******OOP-Interface*******//
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        //*******OOP-Polymorphism*******//
        // Both works
        // Tightly Coupled
        Employee employee=new Employee();
        // Losely Coupled
        BaseEntity employee2=new Employee();
        // left side interface right side is class
        UserServiceImplementation userServiceImplementation=new UserService();


        employee.getEmployeeHours();
        // we need down casting
        // reference type (left side) decides what is accessible
        // object type is right side
        // we need to down casting to handle issue
        ((Employee)employee2).getEmployeeHours();
    }

}
