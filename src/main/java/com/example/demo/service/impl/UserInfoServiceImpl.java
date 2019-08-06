package com.example.demo.service.impl;

import com.example.demo.entity.UserInfo;
import com.example.demo.repo.UserInfoRepo;
import com.example.demo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoRepo userInfoRepo;

    @Override
    public int save() {

        UserInfo userInfo = new UserInfo();
        userInfo.setAge(10);
        userInfo.setPassword("123456");
        userInfo.setSex(1);
        userInfo.setUsername("un1");

        return userInfoRepo.save(userInfo);
    }
}
