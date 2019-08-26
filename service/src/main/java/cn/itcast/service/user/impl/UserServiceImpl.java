package cn.itcast.service.user.impl;

import cn.itcast.dao.user.UserDao;
import cn.itcast.domain.user.User;
import cn.itcast.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
