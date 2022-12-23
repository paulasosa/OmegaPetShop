package com.unab.vetshop.Service;

import com.unab.vetshop.Models.Producto;
import com.unab.vetshop.Dao.ProductoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProductoService {
    @Autowired
    private ProductoDao productoDao;
    @Transactional(readOnly=false)
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        productoDao.deleteById(id);
    }
    @Transactional(readOnly=true)
    public Producto findById(String id) {
        return productoDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }
}