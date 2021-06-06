package task3;

public class MobilePhones extends Electronics{
    private String mobileOs;


    public MobilePhones(String productName, String productCode, double price, String productType, int power, boolean battery, double diagonal, String mobileOs) {
        super(productName, productCode, price, productType, power, battery, diagonal);
        this.mobileOs = mobileOs;
    }

    public MobilePhones() {
        super();
    }

    public String getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("MobileOs: " + mobileOs );
    }
}
