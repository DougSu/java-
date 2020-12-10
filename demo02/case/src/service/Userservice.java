package service;

import domain.User;

import java.util.List;

public interface Userservice {
    List<User> findAll();
    int DML(User user);
    int del(int id);
}
