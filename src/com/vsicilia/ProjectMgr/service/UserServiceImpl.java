package com.vsicilia.ProjectMgr.service;

import com.vsicilia.ProjectMgr.Dto.User;
import com.vsicilia.ProjectMgr.dao.UserDao;

import javax.inject.Inject;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Inject
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public boolean registerUser(User user) {
        return userDao.registerUser(user);
    }
}
