package com.xs.bootdemo.dao;

import com.xs.bootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(User user);
    public void deleteById(int id);
    public User selectById(int id);
    public User selectByName(String name);
    public void update(User user);
}
