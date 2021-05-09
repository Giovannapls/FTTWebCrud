package com.javaweb.webservicejava.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name  = "Produto")
public class Produto {
    @Id
    @GeneratedValue
    private int id;
    private String nomeProduto;
    private Double preco;
    private byte[] imagem;

    public int getId(){
        return this.id;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public Double getPreco(){
        return this.preco;
    }
    public byte[] getImagem(){
        return this.imagem;
    }
    public void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setImagem(byte[] imagem){
        this.imagem = imagem;
    }
}
