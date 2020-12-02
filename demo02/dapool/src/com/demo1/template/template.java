package com.demo1.template;
import com.demo1.utils.JDBCutils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class template {

        private static JdbcTemplate template = new JdbcTemplate(JDBCutils.getdatasource());
        String sql = "update test1 set age = 33 where id = ?";
        private static String sql1 = "select * from test1";
        public static List<Map<String,Object>> findAll(){
            List<Map<String, Object>> rs = template.queryForList(sql1);
            return rs;
        }

    public static void main(String[] args) {
        System.out.println(findAll());
    }

}