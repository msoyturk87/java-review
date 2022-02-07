package com.cydeo.oop.abstraction.service;


import com.cydeo.oop.abstraction.implementation.UserServiceImplementation;
import com.cydeo.oop.encapsulation.Role;
import com.cydeo.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(id,"Admin"));
        return user.getFirstName() + " " + user.getLastName();
    }
    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Ally",new Role(5,"Employee"));
        return user;
    }
}
