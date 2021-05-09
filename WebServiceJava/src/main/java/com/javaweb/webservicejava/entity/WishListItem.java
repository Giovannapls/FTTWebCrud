package com.javaweb.webservicejava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "WishListItens")
public class WishListItem {
    @Id
    @GeneratedValue
    private int id;
    private int idCliente;
    private int idProduto;

    public int getId(){
        return this.id;
    }
    public int getIdCliente(){
        return this.idCliente;
    }
    public int getIdProduto(){
        return this.idProduto;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
}
