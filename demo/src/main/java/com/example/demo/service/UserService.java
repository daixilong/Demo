package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User.User;
import org.beetl.sql.core.SQLReady;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//import org.springframework.transaction.annotation.Transactional;

/**
 * Created by a on 2018/3/13.
 */

@Service
@Transactional
public class UserService extends BaseService<User> {
    @Autowired
    private UserDao userDao;

    public List<User> getList(){
        return userDao.sample();
    }
}
