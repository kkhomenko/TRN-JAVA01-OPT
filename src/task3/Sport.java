package task3;

public class Sport extends Product{
    private String sportType;

    public Sport(String productName, String productCode, double price, String productType, String sportType){
        super(productName, productCode, price);
        this.sportType = sportType;
    }

    public Sport(){
        super();
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Sport type: " + sportType);
    }
}
