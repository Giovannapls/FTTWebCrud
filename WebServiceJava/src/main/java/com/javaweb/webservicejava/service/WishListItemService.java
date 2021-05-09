package com.javaweb.webservicejava.service;


import com.javaweb.webservicejava.entity.WishListItem;
import com.javaweb.webservicejava.repository.WishListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListItemService {
    @Autowired
    private WishListItemRepository repository;

    public WishListItem saveWish(WishListItem produto) {
        return repository.save(produto);
    }

    public List<WishListItem> getWishsByClient(int idCliente) {
        return repository.findWishListItemByidCliente(idCliente);
    }

    public List<WishListItem> getWishsByProduto(int idProduto) {
        return repository.findWishListItemByidProduto(idProduto);
    }

    public WishListItem getWishById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteWishListItem(int id) {
        repository.deleteById(id);
        return "WishListItem removido: " + id;
    }
}
