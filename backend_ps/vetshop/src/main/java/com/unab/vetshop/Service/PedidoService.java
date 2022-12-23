package com.unab.vetshop.Service;

import com.unab.vetshop.Models.Pedido;
import com.unab.vetshop.Dao.PedidoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
@Service
public class PedidoService {
    @Autowired
    private PedidoDao pedidoDao;
    @Transactional(readOnly=false)
    public Pedido save(Pedido pedido) {
        return pedidoDao.save(pedido);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        pedidoDao.deleteById(id);
    }
    @Transactional(readOnly=true)
    public Pedido findById(String id) {
        return pedidoDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Pedido> findAll() {
        return (List<Pedido>) pedidoDao.findAll();
    }
}