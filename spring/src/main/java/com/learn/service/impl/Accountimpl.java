package com.learn.service.impl;

import com.learn.dao.impl.AccountDao;
import com.learn.service.AccountService;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/17-11:01 上午
 */

public class Accountimpl implements AccountService {

    private AccountDao accountDao;

    public Accountimpl() {
        System.out.println("aaa");
    }

    @Override
    public void saveAccount() {
        accountDao = new AccountDao();
        accountDao.saveAcc();
        System.out.println("sercive");
    }
}
