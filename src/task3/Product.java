package task3;

public class Product {
    private String productName;
    private String productCode;
    private double price;

    //no-argument constructor to initialize default price =1
    public Product() {
        price = 1;
    }

    // parameterized constructor
    public Product(String productName, String productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show() {
        System.out.println("\nProduct name: " + productName +  "\nproduct code: " + this.productCode + "\nprice: " + price);
    }
}
