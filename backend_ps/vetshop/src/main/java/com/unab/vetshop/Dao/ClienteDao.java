package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, String> {
    
}