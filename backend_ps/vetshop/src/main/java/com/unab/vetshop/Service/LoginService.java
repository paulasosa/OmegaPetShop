package com.unab.vetshop.Service;

import com.unab.vetshop.Models.Login;
import com.unab.vetshop.Dao.LoginDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;
@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    @Transactional(readOnly=false)
    public Login save(Login login) {
        return loginDao.save(login);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        loginDao.deleteById(id);
    }
    @Transactional(readOnly=true)
    public Login findById(String id) {
        return loginDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Login> findAll() {
        return (List<Login>) loginDao.findAll();
    }
}