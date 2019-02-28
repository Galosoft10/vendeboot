package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
