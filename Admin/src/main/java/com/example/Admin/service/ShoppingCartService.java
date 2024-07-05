package com.example.Admin.service;


import com.example.Admin.dto.ProductDto;
import com.example.Admin.dto.ShoppingCartDto;
import com.example.Admin.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(ProductDto productDto, int quantity, String username);

    ShoppingCart updateCart(ProductDto productDto, int quantity, String username);

    ShoppingCart removeItemFromCart(ProductDto productDto, String username);

    ShoppingCartDto addItemToCartSession(ShoppingCartDto cartDto, ProductDto productDto, int quantity);

    ShoppingCartDto updateCartSession(ShoppingCartDto cartDto, ProductDto productDto, int quantity);

    ShoppingCartDto removeItemFromCartSession(ShoppingCartDto cartDto, ProductDto productDto, int quantity);

    ShoppingCart combineCart(ShoppingCartDto cartDto, ShoppingCart cart);


    void deleteCartById(Long id);

    ShoppingCart getCart(String username);
}
