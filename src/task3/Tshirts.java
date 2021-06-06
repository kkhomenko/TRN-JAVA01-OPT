package task3;

public class Tshirts extends Clothes{
    private String fitType; //slim, loose

    public Tshirts(String productName, String productCode, double price, String productType, String size, String gender, String season, String fitType) {
        super(productName, productCode, price, productType, size, gender, season);
        this.fitType = fitType;
    }

    //no-argument constructor to initialize default price = 1
    public Tshirts() {
        super();
    }

    public String getFitType() {
        return fitType;
    }

    public void setFitType(String fitType) {
        this.fitType = fitType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Fit type: " + fitType);
    }
}
