package com.cydeo;



import com.cydeo.core.Loops;
import com.cydeo.core.Methods;
import com.cydeo.core.SelectionStatements;
import com.cydeo.oop.encapsulation.Role;
import com.cydeo.oop.encapsulation.User;

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


    }

}
