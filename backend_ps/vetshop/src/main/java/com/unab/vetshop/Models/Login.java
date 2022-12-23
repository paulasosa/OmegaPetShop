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
@Table(name="login")
public class Login  implements Serializable{
    @Id
    @Column(name="id_login")
    private String id_login;

    @ManyToMany
    @JoinColumn(name="correo_reg")
    @JoinColumn(name="contrasena_reg")
    private Registro registro;


    @Override
    public String toString() {
        return "Login [id_login=" + id_login + ",  registro=" + registro + "]";
    }
}
