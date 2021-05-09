package com.javaweb.webservicejava.repository;

import com.javaweb.webservicejava.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
