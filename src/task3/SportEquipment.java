package task3;

public class SportEquipment extends Sport {
    private String equipmentClass; //home, professional
    private boolean equipmentElectroType; //electronic or not


    public SportEquipment(String productName, String productCode, double price, String productType, String sportType, String equipmentClass, boolean equipmentElectroType) {
        super(productName, productCode, price, productType, sportType);
        this.equipmentClass = equipmentClass;
        this.equipmentElectroType = equipmentElectroType;
    }

    public SportEquipment() {
        super();
    }

    public String getEquipmentClass() {
        return equipmentClass;
    }

    public void setEquipmentClass(String equipmentClass) {
        this.equipmentClass = equipmentClass;
    }

    public boolean isEquipmentElectroType() {
        return equipmentElectroType;
    }

    public void setEquipmentElectroType(boolean equipmentElectroType) {
        this.equipmentElectroType = equipmentElectroType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Equipment class: " + equipmentClass + "\nEquipment electro type: " + equipmentElectroType);
    }
}
