package com.learn.dao;

import com.learn.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：Doug
 * @description：TODO
 * @date ：2020/12/9-6:16 下午
 */

public interface UserImp {

    /**
     * 查询所有操作
     * @return
     */
    List<User> FindAll();

    /**
     * 模糊查询
     * @param user user名称
     * @return
     */
    List<User> findByName(User user);

    /**
     * 增加
     * @param user
     */
    void insert(User user);
}
