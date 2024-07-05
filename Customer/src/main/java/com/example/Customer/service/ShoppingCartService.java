package com.example.Customer.service;


import com.example.Customer.dto.ProductDto;
import com.example.Customer.dto.ShoppingCartDto;
import com.example.Customer.model.ShoppingCart;

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
