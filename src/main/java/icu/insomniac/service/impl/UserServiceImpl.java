package icu.insomniac.service.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.pojo.User;
import icu.insomniac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @PostConstruct
    public void init(){
        System.out.println("UserServiceImpl init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("UserServiceImpl destroy...");
    }

    public boolean signIn(String username, String password) {
        User user = userDao.findByCondition(username, password);
        return user != null;
    }

    public boolean checkAccount(String username) {
        User user = userDao.findByUsername(username);
        return user == null;
    }
}
