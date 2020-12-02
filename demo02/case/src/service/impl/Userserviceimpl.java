package service.impl;

import dao.UserDao;
import dao.impl.UserDaoimpl;
import domain.User;
import service.Userservice;

import java.util.List;

public class Userserviceimpl implements Userservice {
    private UserDaoimpl dao = new UserDaoimpl();
    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public int DML(User user) {
        return dao.DML(user);
    }

    @Override
    public int del(int id) {
        return dao.del(id);
    }
}
