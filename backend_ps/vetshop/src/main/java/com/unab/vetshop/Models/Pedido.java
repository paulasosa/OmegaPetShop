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
@Table(name="pedido")
public class Pedido  implements Serializable{
    @Id
    @Column(name="id_pedido")
    private String id_pedido;
    @Column(name="productos_total")
    private String productos_total;
    @Column(name="cantidad_productos")
    private String cantidad_productos;
    @Column(name="precio_total")
    private String precio_total;

    @Override
    public String toString() {
        return "Pedido [id_pedido=" + id_pedido + ", productos_total=" + productos_total + ", cantidad_productos="
                + cantidad_productos + ", precio_total="
                + precio_total + "]";
    }
}
