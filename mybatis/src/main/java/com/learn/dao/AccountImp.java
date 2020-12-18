package com.learn.dao;

import com.learn.domain.Account;

import java.util.List;

public interface AccountImp {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
}
