package icu.insomniac.dao.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.pojo.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class UserDaoImpl implements UserDao {

    @PostConstruct
    public void init(){
        System.out.println("UserDaoImpl init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("UserDaoImpl destroy...");
    }

    public User findByCondition(String username, String password) {
        System.out.println("findByCondition(String username, String password): "+username+", "+password);
        return null;
    }

    public User findByUsername(String username) {
        System.out.println("findByUsername(String username): "+username);
        return null;
    }
}
