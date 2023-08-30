import entity.Customer;
import entity.ProductTree;
import service.CartService;
import service.CustomerService;
import service.ProductService;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductService.addProductToList();
//        ProductService.removeProductById();

//        Scanner scanner = new Scanner(System.in);
////        System.out.println("Nhập id sản phẩm muốn sửa");
//        int idProduct = scanner.nextInt();
//        scanner.nextLine();
//        ProductService.updateInfoProduct(idProduct);
        ProductService.addProductToTree();
//        ProductService.displayProductList();

//        CustomerService.register();
//        CustomerService.displayCustomerList();
//
//        CustomerService.buyProduct();
//        CustomerService.displayCustomerList();
    }
}