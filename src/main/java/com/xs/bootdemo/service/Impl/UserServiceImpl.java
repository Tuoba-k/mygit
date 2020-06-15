package com.xs.bootdemo.service.Impl;

import com.xs.bootdemo.dao.UserMapper;
import com.xs.bootdemo.entity.User;
import com.xs.bootdemo.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl  implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Transactional
    @Override
    public void insert(User user){
        userMapper.insert(user);
    }

    @Transactional
    @Override
    public void deleteById(int id){
        userMapper.deleteById(id);
    }

    @Override
    public User selectById(int id) {
        User user=userMapper.selectById(id);
        return user;
    }

    @Override
    public User selectByName(String name) {
        User user=userMapper.selectByName(name);
        return user;
    }

    @Override
    public void update(String name,String address) {
        User user=new User();
        user.setName(name);
        user.setAddress(address);
        userMapper.update(user);
        //return user;
    }
}
