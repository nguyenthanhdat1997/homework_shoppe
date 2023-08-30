package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private long totalPrice;
    private List<CartLineItem>  cartLineItems = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CartLineItem> getCartLineItems() {
        return cartLineItems;
    }

    public void setCartLineItems(List<CartLineItem> cartLineItems) {
        this.cartLineItems = cartLineItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", cartLineItems=" + cartLineItems +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
