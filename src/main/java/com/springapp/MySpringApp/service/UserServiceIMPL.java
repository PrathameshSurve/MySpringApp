package com.springapp.MySpringApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.MySpringApp.model.User;
import com.springapp.MySpringApp.repository.Repo;

@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    Repo obj;

    @Override
    public User addUser(User user) {
        obj.save(user);
        return user;
    }

}
