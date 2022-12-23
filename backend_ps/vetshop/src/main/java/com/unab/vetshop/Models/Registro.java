package com.unab.vetshop.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="registro")
public class Registro  implements Serializable{
    @Id
    @Column(name="id_registro")
    private String id_registro;
    @Column(name="correo_reg")
    private String correo_reg;
    @Column(name="contrasena_reg")
    private String contrasena_reg;

    @Override
    public String toString() {
        return "Login [id_registro=" + id_registro + ", correo_reg=" + correo_reg + ",  contrasena_reg=" + contrasena_reg + "]";
    }
}