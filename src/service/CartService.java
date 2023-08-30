package service;

import entity.Cart;

public class CartService {
    public static Cart addCart(){
        Cart cart = new Cart();
        cart.setId(1);
        cart.setTotalPrice(0);
        return cart;
    }
}
