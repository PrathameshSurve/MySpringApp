package com.springapp.MySpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springapp.MySpringApp.model.User;

public interface Repo extends JpaRepository<User, Integer> {

}