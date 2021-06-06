package task3;

public class SportFood extends Sport{
    private String flavour; //vanilla, chocolate, strawberry
    private String productForm; //pills, powder

    public SportFood(String productName, String productCode, double price, String productType, String sportType, String flavour, String productForm) {
        super(productName, productCode, price, productType, sportType);
        this.flavour = flavour;
        this.productForm = productForm;
    }

    public SportFood() {
        super();
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getProductForm() {
        return productForm;
    }

    public void setProductForm(String productForm) {
        this.productForm = productForm;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Flavour: " + flavour + "\nProduct form: " + productForm);
    }
}
