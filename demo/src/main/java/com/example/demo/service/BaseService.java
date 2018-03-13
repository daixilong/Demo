package com.example.demo.service;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by a on 2018/3/13.
 */
public class BaseService<T> {
    @Autowired
    SQLManager sqlManager;

    public  boolean save(T model){
        return  sqlManager.insert(model,true)>0;
    }

    public List<T> query(){
        return sqlManager.select("sample",getCurrentEntityClassz());
    }

    /**
     * 获取当前的class
     * @return
     */
    @SuppressWarnings("unchecked")
    private Class<T> getCurrentEntityClassz() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
