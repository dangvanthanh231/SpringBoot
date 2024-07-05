package com.example.Admin.dto;


import com.example.Admin.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartDto {
    private Long id;

    private Customer customer;

    private double totalPrice;

    private int totalItems;

    private Set<CartItemDto> cartItems;

}
