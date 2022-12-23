package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Login;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends CrudRepository<Login, String> {
    
}