package com.javaweb.webservicejava.repository;

import com.javaweb.webservicejava.entity.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishListItemRepository extends JpaRepository<WishListItem, Integer> {
    List<WishListItem> findWishListItemByidCliente(int idCliente);
    List<WishListItem> findWishListItemByidProduto(int idProduto);
}
