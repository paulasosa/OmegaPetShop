package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Factura;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaDao extends CrudRepository<Factura, String> {
    
}