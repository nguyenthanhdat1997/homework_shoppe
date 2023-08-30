package entity;

public class CartLineItem {
    private Product product;
private long sub_total;
    public Product getProduct() {
        return product;
    }

    public long getSub_total() {
        return sub_total;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "product=" + product +
                ", sub_total=" + sub_total +
                '}';
    }

    public void setSub_total(long sub_total) {
        this.sub_total = sub_total;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
