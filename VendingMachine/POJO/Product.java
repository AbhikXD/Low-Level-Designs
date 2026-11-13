package POJO;

public class Product {
    private String productName;
    private String productId;
    private double productPrice;

    public Product(){
    this.productId = null;
    this.productName = null;
    this.productPrice = 0.0;
    }
    public Product(String productName,String productId, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public String getProductName(){
        return productName;
    }
    public String getProductId(){
        return productId;
    }
    public double getProductPrice(){
        return productPrice;
    }
}
