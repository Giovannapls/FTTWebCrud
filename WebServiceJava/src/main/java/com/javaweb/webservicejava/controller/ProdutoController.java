package com.javaweb.webservicejava.controller;

import com.javaweb.webservicejava.entity.Cliente;
import com.javaweb.webservicejava.entity.Produto;
import com.javaweb.webservicejava.service.ClienteService;
import com.javaweb.webservicejava.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/Produto/")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @PostMapping("/addProduto")
    public Produto addProduto(@RequestBody Produto produto) {
        return service.saveProduto(produto);
    }


    @GetMapping("/produto")
    public List<Produto> findAllProdutos() {
        return service.getProdutos();
    }

    @GetMapping("/produtoById/{id}")
    public Produto findProdutoById(@PathVariable int id) {
        return service.getProdutoById(id);
    }


    @PutMapping("/update")
    public Produto updateProduto(@RequestBody Produto produto) {
        return service.updateCliente(produto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduto(@PathVariable int id) {
        return service.deleteProduto(id);
    }
}
