package task3;

public class Electronics extends Product{
    private int power;
    private boolean battery;
    private double diagonal;

    public Electronics(String productName, String productCode, double price, String productType, int power, boolean battery, double diagonal) {
        super(productName, productCode, price);
        this.power = power;
        this.battery = battery;
        this.diagonal = diagonal;
    }

    public Electronics() {
        super();
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Power:" + power + "\nBattery:" + battery + "\nDiagonal: " + diagonal);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

}

