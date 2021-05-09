package com.javaweb.webservicejava.controller;

import com.javaweb.webservicejava.entity.Produto;
import com.javaweb.webservicejava.entity.WishListItem;
import com.javaweb.webservicejava.service.ProdutoService;
import com.javaweb.webservicejava.service.WishListItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/Wish/")
public class WishListItemController {
    @Autowired
    private WishListItemService service;

    @PostMapping("/addWishListItem")
    public WishListItem addWishListItem(@RequestBody WishListItem wish) {
        return service.saveWish(wish);
    }

    @GetMapping("/WishListItemById/{id}")
    public WishListItem findWishListItemById(@PathVariable int id) {
        return service.getWishById(id);
    }
    @GetMapping("/WishListItemByCliente/{id}")
    public List<WishListItem> findWishListItemByCliente(@PathVariable int id) {
        return service.getWishsByClient(id);
    }
    @GetMapping("/WishListItemByProduto/{id}")
    public List<WishListItem> findWishListItemByProdut(@PathVariable int id) {
        return service.getWishsByProduto(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteWishListItem(@PathVariable int id) {
        return service.deleteWishListItem(id);
    }
}
