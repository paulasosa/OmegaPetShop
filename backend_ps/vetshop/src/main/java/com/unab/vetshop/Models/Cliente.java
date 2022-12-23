package com.unab.vetshop.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cliente")
public class Cliente  implements Serializable{
    @Id
    @Column(name="id_cliente")
    private String id_cliente;
    @Column(name="nombre_cliente")
    private String nombre_cliente;
    @Column(name="direccion_cliente")
    private String direccion_cliente;
    
    @ManyToMany
    @JoinColumn(name="correo_reg")
    @JoinColumn(name="contrasena_reg")
    private Registro registro;

    
    @Override
    public String toString() {
        return "Cliente [id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", registro="
                + registro + ", direccion_cliente="
                + direccion_cliente + "]";
    }
}
