package com.unab.vetshop.Controller;


import com.unab.vetshop.Models.Factura;

import com.unab.vetshop.Dao.FacturaDao;
import com.unab.vetshop.Service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    private FacturaDao facturaDao; 
    @Autowired
    private FacturaService facturaService;
    @PostMapping(value="/")
    public ResponseEntity<Factura> agregar(@RequestBody Factura factura){        
        Factura obj = facturaService.save(factura);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Factura> eliminar(@PathVariable String id){ 
        Factura obj = facturaService.findById(id); 
        if(obj!=null) 
        facturaService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @PutMapping(value="/") 
    public ResponseEntity<Factura> editar(@RequestBody Factura factura){ 
        Factura obj = facturaService.findById(factura.getId_factura()); 
        if(obj!=null) { 
            //obj.setNombre_factura(factura.getNombre_factura());
            //obj.setClave_cliente(cliente.getClave_cliente());
            facturaService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    @GetMapping("/list") 
    public List<Factura> consultarTodo(){
        return facturaService.findAll(); 
    }
    @GetMapping("/list/{id}") 
    public Factura consultaPorId(@PathVariable String id){ 
        return facturaService.findById(id); 
    }
}