package task3;

class Sneakers extends Clothes{
    private String soleMaterial;

    public Sneakers(String productName, String productCode, double price, String productType, String size, String gender, String season, String soleMaterial) {
        super(productName, productCode, price, productType, size, gender, season);
        this.soleMaterial = soleMaterial;
    }

    public Sneakers() {
        super();
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Sole material: " + soleMaterial);
    }
}

