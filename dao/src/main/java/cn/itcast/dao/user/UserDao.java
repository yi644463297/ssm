package cn.itcast.dao.user;

import cn.itcast.domain.user.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
