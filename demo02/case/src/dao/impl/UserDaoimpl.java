package dao.impl;

import dao.UserDao;
import domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.util.List;
import java.util.Map;

public class UserDaoimpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getdatasource());
    @Override
    public List<User> findAll() {
        String sql = "select * from test1";
        List<User> rs = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return rs;
    }

    @Override
    public int DML(User user) {
        String sql_insert = "insert into test1(name,age,gender,qq,email) value (?,?,?,?,?)";
        int count = template.update(sql_insert,user.getName(),user.getAge(),user.getGender(),user.getQq(),user.getEmail());
        return count;
    }

    @Override
    public int del(int id) {
        String sql_insert = "delete from test1 where id = ?";
        int count = template.update(sql_insert,id);
        return count;
    }
}
