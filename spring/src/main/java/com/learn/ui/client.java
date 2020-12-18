package com.learn.ui;

import com.learn.dao.AccountDaoimpl;
import com.learn.service.AccountService;
import com.learn.service.impl.Accountimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/17-11:07 上午
 */

public class client {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountDaoimpl ad = (AccountDaoimpl) ac.getBean("accountdao");
        AccountService at = ac.getBean("accountService", AccountService.class);
        at.saveAccount();
    }



}