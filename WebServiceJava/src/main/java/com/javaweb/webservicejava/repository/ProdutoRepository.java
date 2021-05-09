package com.javaweb.webservicejava.repository;

import com.javaweb.webservicejava.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
