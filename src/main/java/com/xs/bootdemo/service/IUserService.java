package com.xs.bootdemo.service;

import com.xs.bootdemo.entity.User;

public interface IUserService {
    public void insert(User user);
    public void deleteById(int id);
    public User selectById(int id);
    public User selectByName(String name);
    public void update(String name,String address);
}
