package com.zhangyanfu.service;

import com.zhangyanfu.dao.UserDAOImpl;
import com.zhangyanfu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/25.
 * @Email 1105564280@qq.com
 */
@Service
public class UserService {
    @Autowired
    UserDAOImpl userDAO;
    public List<User>  getUsers(){
        return userDAO.getUsers();
    }
}
