package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Producto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends CrudRepository<Producto, String> {
    
}