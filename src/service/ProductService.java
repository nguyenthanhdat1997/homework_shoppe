package service;

import entity.Product;
import entity.ProductTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Product> products;

    static {
        products = new ArrayList<>();
    }

    public static void addProductToList() {
        int index = 1;
        while (true) {
            System.out.println("Bạn có muốn thêm sản phẩm không! Nhập y để tiếp tục, n để kết thúc");
            String answer = scanner.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                Product product = new Product();

                System.out.println("Nhập tên sản phẩm: ");
                String nameProduct = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm");
                long priceProduct = scanner.nextLong();
                scanner.nextLine();

                product.setId(index);
                product.setName(nameProduct);
                product.setPrice(priceProduct);

                products.add(product);
                index++;
            } else {
                break;
            }

        }

    }

    public static void removeProductToList(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }

    }

    public static void removeProductById() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        Scanner scanner = new Scanner(System.in);
        int idProduct = scanner.nextInt();
        scanner.nextLine();
        removeProductToList(idProduct);
    }

    public static void updateInfoProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Nhập tên mới");
                String nameProduct = scanner.nextLine();
                System.out.println("Nhập giá mới");
                long priceProduct = scanner.nextLong();
                scanner.nextLine();
                product.setName(nameProduct);
                product.setPrice(priceProduct);
            }
        }
    }

    public static void displayProductList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static Product findProductById(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    public static void addProductToTree() {

        ProductTree productTree = new ProductTree();

        for (Product product : products) {
            if (productTree.getProduct() == null) {
                productTree.setProduct(product);
            } else if (productTree.getProduct().getPrice() < product.getPrice()) {
                ProductTree productLeft = new ProductTree();
                productLeft.setProduct(product);
                productTree.setLeft(productLeft);

            } else {
                ProductTree productRight = new ProductTree();
                productRight.setProduct(product);
                productTree.setRight(productRight);
            }
        }
        for (Product product: products ) {
            if(product.getPrice() == 100){
                System.out.println(product);
            }
        }
    }
    //Tìm phần tử có giá 100k
}
