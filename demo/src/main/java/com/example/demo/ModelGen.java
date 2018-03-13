//package com.example.demo;
//
//import org.beetl.sql.core.*;
//import org.beetl.sql.core.db.DBStyle;
//import org.beetl.sql.core.db.MySqlStyle;
//import org.beetl.sql.ext.DebugInterceptor;
//
///**
// * Created by a on 2018/3/13.
// */
//public class ModelGen {
//    public static void main(String[] args) throws Exception {
//        final String driver="com.mysql.jdbc.Driver";
//        final String url="jdbc:mysql://localhost:3306/act_test";
//        final String userName="root";
//        final String pass="daixilong";
//        ConnectionSource cs= ConnectionSourceHelper.getSimple(driver,url,userName,pass);
//        UnderlinedNameConversion um=new UnderlinedNameConversion();
//        SQLLoader sqlLoader=new ClasspathLoader("/sql/test");
//        DBStyle dbStyle=new MySqlStyle();
//        SQLManager sqlManager=new SQLManager(dbStyle, sqlLoader,cs,um,new Interceptor[]{new DebugInterceptor()});
//        sqlManager.genPojoCode("User","com.example.demo.model.User");
//        sqlManager.genSQLFile("User");
//    }
//}
