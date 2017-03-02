package com.store.dao;

import com.store.mapper.*;
import com.store.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by jack on 16/5/27.
 */
public class UserDao extends SqlSessionDaoSupport {
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
    private UserMapper mapper;

    public UserDao() {
        String resource = "conf.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();
            mapper = session.getMapper(UserMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User findUserById(long id) {
        System.out.println("findUserById");
        User user = new User();
        user.setUsername("jack123");
        user.setPassword("123456");

        System.out.println(mapper);
        mapper.selectByPrimaryKey(1l);

        System.out.println(mapper.selectByPrimaryKey(1l));
        return user;
    }

    public int addUser(User user) {

        return 0;
    }

    public List<User> getAllUsers() {
        return null;
    }

//    private SqlSessionFactory sessionFactory;
//    private SqlSession session;
//    private UserMapper mapper;
//
//    public UserDao() {
//        String resource = "conf.xml";
//        try {
//            Reader reader = Resources.getResourceAsReader(resource);
//            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            session = sessionFactory.openSession();
//            mapper = session.getMapper(UserMapper.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public User findUserById(int id) {
//        SqlSession session=this.getSqlSession();
//        return mapper.findUserById(id);
//    }
//
//    public int addUser(User user) {
//        mapper.addUser(user);
//        session.commit();
//        return 0;
//    }
//
//    public List<User> getAllUsers() {
//        return mapper.getAllUsers();
//    }
}
