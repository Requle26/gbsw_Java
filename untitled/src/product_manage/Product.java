package product_manage;

public class Product {
    int productId;
    int price;
    String name;
    int sales;

    public Product() {

    }

    public int getProductSellAmount() {
        return sales * price;
    }

    public Product(int productId, int price, String name, int sales) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.sales = sales;
    }

}
