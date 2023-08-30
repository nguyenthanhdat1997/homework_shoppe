package service;

import entity.Cart;
import entity.CartLineItem;
import entity.Customer;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
    }

    public static void register(){
        Cart cart = CartService.addCart();
        Customer customer = new Customer();
        customer.setCart(cart);
        customer.setId(1);
        customer.setUserName("Dat");
        customer.setPassword("123456");
        customers.add(customer);
    }

    public static void displayCustomerList(){
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    public static void buyProduct(){
        int productId = 1;
        int quantity = 2;
        Product product = ProductService.findProductById(productId);
        CartLineItem cartLineItem = new CartLineItem();
        cartLineItem.setProduct(product);
        cartLineItem.setSub_total(quantity* product.getPrice());

        int customerID = 1;
        Customer customer = findByCustomerId(customerID);
        Cart cart = customer.getCart();
        List<CartLineItem> cartLineItems = cart.getCartLineItems();

        long total = cart.getTotalPrice() + quantity* product.getPrice();
        cart.setTotalPrice(total);
        cartLineItems.add(cartLineItem);
    }
    public static Customer findByCustomerId(int customerId){
        for (Customer customer:customers) {
            if(customerId == customer.getId()){
                return customer;
            }
        }
        return null;
        }
    }


