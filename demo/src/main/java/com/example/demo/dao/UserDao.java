package com.example.demo.dao;

import com.example.demo.model.User.User;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by a on 2018/3/13.
 */
@SqlResource("test.user")
public interface UserDao extends BaseMapper<User> {

}
