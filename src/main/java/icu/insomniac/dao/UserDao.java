package icu.insomniac.dao;

import icu.insomniac.pojo.User;

public interface UserDao {
    User findByCondition(String username, String password);

    User findByUsername(String username);
}
