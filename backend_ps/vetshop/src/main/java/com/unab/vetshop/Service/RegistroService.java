package com.unab.vetshop.Service;

import com.unab.vetshop.Models.Registro;
import com.unab.vetshop.Dao.RegistroDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
@Service
public class RegistroService {
    @Autowired
    private RegistroDao registroDao;
    @Transactional(readOnly=false)
    public Registro save(Registro registro) {
        return registroDao.save(registro);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        registroDao.deleteById(id);
    }
    @Transactional(readOnly=true)
    public Registro findById(String id) {
        return registroDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Registro> findAll() {
        return (List<Registro>) registroDao.findAll();
    }
}