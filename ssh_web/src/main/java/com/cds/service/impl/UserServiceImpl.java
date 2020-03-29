package com.cds.service.impl;

import com.cds.dao.UserDao;
import com.cds.po.UserEntity;
import com.cds.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao(){
        return  userDao;
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public UserEntity getUser(int id) {
        UserEntity userEntity = userDao.getUser(id);
        return userEntity;
    }
}
