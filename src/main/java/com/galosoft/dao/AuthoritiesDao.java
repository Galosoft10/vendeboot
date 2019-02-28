package com.galosoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galosoft.entities.Authorities;

public interface AuthoritiesDao extends JpaRepository<Authorities, Integer> {

}
