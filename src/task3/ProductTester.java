package task3;

public class ProductTester {
    public static void main(String[] args) {

        // Initialize a few products with default price, update price and set some custom attribute values for them.

        SportFood product1 = new SportFood();
        product1.setProductName("Protein");
        product1.setProductCode("uhdd34");
        product1.setSportType("Bodybuilding");
        product1.setPrice(67);
        product1.setProductForm("powder");
        product1.setFlavour("Kiwi");

        SportEquipment product2 = new SportEquipment();
        product2.setProductName("Treadmill");
        product2.setPrice(45.55);
        product2.setProductCode("!QA2ws");
        product2.setSportType("Running");
        product2.setEquipmentClass("Home edition");
        product2.setEquipmentElectroType(true);


        // Initialize several products with user-defined attribute values.
        MobilePhones product3 = new MobilePhones("iPhoneXS", "TGH456", 999.7, "Mobile", 23, true, 5.6,"iOS");
        Tshirts product4 = new Tshirts("Tshirt TH", "5gy7f", 9.66, "Clothes", "XL", "Female", "Spring", "slim");

        // Print all characteristics of products initialized previously.
        product1.show();
        product2.show();
        product3.show();
        product4.show();
    }
}
