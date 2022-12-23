package com.unab.vetshop.Dao;

import com.unab.vetshop.Models.Pedido;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoDao extends CrudRepository<Pedido, String> {
    
}