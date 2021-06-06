package task3;

public class Clothes extends Product{
    private String size; //S, M, L, XL
    private String gender; //Male, Female
    private String season;  //Spring, Summer, Fall, Winter

    public Clothes(String productName, String productCode, double price, String productType, String size, String gender, String season) {
        super(productName, productCode, price);
        this.size = size;
        this.gender = gender;
        this.season = season;
    }

    public Clothes() {
        super();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public void show() {
        super.show();System.out.println("Size: " + size + "\nGender: " + gender + "\nSeason: " + season);
    }
}
