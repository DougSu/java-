package com.learn.domain;

import com.learn.dao.AccountImp;

import java.io.Serializable;
import java.util.List;
import java.util.SplittableRandom;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/14-8:23 下午
 */

public class Account implements Serializable {

    private Integer id;
    private Integer uid;
    private Double money;

    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                ","+
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
