package com.javaweb.webservicejava.service;


import com.javaweb.webservicejava.entity.Produto;
import com.javaweb.webservicejava.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto saveProduto(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> getProdutos() {
        return repository.findAll();
    }

    public Produto getProdutoById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteProduto(int id) {
        repository.deleteById(id);
        return "Produto removido: " + id;
    }

    public Produto updateCliente(Produto produto) {
        Produto atualProduto = repository.findById(produto.getId()).orElse(null);
        atualProduto.setNomeProduto(produto.getNomeProduto());
        atualProduto.setPreco(produto.getPreco());
        atualProduto.setImagem(produto.getImagem());
        return repository.save(atualProduto);
    }
}
