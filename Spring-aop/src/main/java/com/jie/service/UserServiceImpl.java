package com.jie.service;

import com.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("改变一个用户");
    }

    @Override
    public void search() {
        System.out.println("查找一个用户");
    }
}
