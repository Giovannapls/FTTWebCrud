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
@Table(name  = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private int id;
    private String nomeCompleto;
    private String email;

    public int getId(){
        return this.id;
    }
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nome){
        this.nomeCompleto = nome;
    }
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
