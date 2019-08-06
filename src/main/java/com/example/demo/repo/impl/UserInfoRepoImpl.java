package com.example.demo.repo.impl;

import com.example.demo.dao.UserInfoDAO;
import com.example.demo.entity.UserInfo;
import com.example.demo.repo.UserInfoRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoRepoImpl implements UserInfoRepo {

    @Resource
    private UserInfoDAO userInfoDAO;


    @Override
    public int save(UserInfo userInfo) {
        return userInfoDAO.save(userInfo);
    }
}
