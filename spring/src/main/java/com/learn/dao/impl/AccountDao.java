package com.learn.dao.impl;

import com.learn.dao.AccountDaoimpl;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/17-10:57 上午
 */

public class AccountDao implements AccountDaoimpl {
    @Override
    public void saveAcc() {
        System.out.println("保存了账户");
    }
}
