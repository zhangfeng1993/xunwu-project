package com.zf.service;

import com.zf.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(Long id);
}
