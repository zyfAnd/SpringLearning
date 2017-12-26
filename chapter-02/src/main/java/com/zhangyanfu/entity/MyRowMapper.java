package com.zhangyanfu.entity;

import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/26.
 * @Email 1105564280@qq.com
 */
public class MyRowMapper implements RowMapper<User> {

    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setProject_name(resultSet.getString("project_name"));
        user.setPurpose(resultSet.getString("purpose"));
        user.setDepartment(resultSet.getString("department"));
        user.setId(resultSet.getInt("id"));
        user.setMoney(resultSet.getString("money"));
        System.out.println("user " + user);
        return user;
    }
}
