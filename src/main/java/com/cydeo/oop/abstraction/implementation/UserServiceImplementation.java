package com.cydeo.oop.abstraction.implementation;


import com.cydeo.oop.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);

}
