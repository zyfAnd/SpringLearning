package com.zhangyanfu.dao;

import com.zhangyanfu.entity.MyRowMapper;
import com.zhangyanfu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/25.
 * @Email 1105564280@qq.com
 */
@Repository
public class UserDAOImpl implements IUserDAO {
    JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<User> getUsers() {
        String sql = "select * from info";
        List<User> list = jdbcTemplate.query(sql, new MyRowMapper());
//        while(it.hasNext()) {
//            Map studentMap = (Map) it.next();
//            System.out.println("id:"+studentMap.get("id") + "; ");
//            System.out.println("project_name:"+studentMap.get("project_name") + "; ");
//            System.out.println("purpose:"+studentMap.get("purpose") + "; ");
//            System.out.println("department:"+studentMap.get("department"));
//            System.out.println("money:"+studentMap.get("money"));
//            Object money = studentMap.get("money");
//        }
        System.out.println("list:"+list);
        return list;
    }



}
