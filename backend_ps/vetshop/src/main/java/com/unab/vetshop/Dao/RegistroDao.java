package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Registro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroDao extends CrudRepository<Registro, String> {
    
}