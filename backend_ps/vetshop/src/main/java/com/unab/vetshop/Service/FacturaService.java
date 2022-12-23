package com.unab.vetshop.Service;

import com.unab.vetshop.Models.Factura;
import com.unab.vetshop.Dao.FacturaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
@Service
public class FacturaService {
    @Autowired
    private FacturaDao facturaDao;
    @Transactional(readOnly=false)
    public Factura save(Factura factura) {
        return facturaDao.save(factura);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        facturaDao.deleteById(id);
    }
    @Transactional(readOnly=true)
    public Factura findById(String id) {
        return facturaDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Factura> findAll() {
        return (List<Factura>) facturaDao.findAll();
    }
}