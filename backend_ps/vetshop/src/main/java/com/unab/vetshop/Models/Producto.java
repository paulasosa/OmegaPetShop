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
@Table(name="producto")
public class Producto  implements Serializable{
    @Id
    @Column(name="id_producto")
    private String id_producto;
    @Column(name="nombre_prod")
    private String nombre_prod;
    @Column(name="precio_prod")
    private String precio_prod;
    @Column(name="cantidad_prod")
    private String cantidad_prod;
    @Column(name="detalle_prod")
    private String detalle_prod;
    @Column(name="imagen_prod")
    private String imagen_prod;

    @Override
    public String toString() {
        return "Producto [id_producto=" + id_producto + ", nombre_prod=" + nombre_prod + ", precio_prod=" + precio_prod + ", cantidad_prod=" + cantidad_prod + ", detalle_prod=" + detalle_prod + ", imagen_prod=" + imagen_prod + "]";
    }
}
