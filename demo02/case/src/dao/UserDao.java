package dao;

import domain.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public int DML(User user);
    public int del(int id);

}
