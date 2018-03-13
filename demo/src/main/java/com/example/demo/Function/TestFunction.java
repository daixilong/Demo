package com.example.demo.Function;

import org.beetl.core.Context;
import org.beetl.core.Function;

/**
 * Created by a on 2018/3/13.
 */
public class TestFunction implements Function {
    @Override
    public Object call(Object[] objects, Context context) {
        return "123";
    }
}
