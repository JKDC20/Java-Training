package M3_Activity3;

public class Car {

    private CarInfo info = new CarInfo();

    // no args constructor
    public Car() {
    }

    // parameterized constructor
    public Car(String brand, String model, String condition, int miles) {
        info.setBrand(brand);
        info.setModel(model);
        info.setCondition(condition);
        info.setMiles(miles);
    }

    // Method to display specs
    public void displayInfo() {
        System.out.println("Brand: " + info.getBrand());
        System.out.println("Model: " + info.getModel());
        System.out.println("Condition: " + info.getCondition());
        System.out.println("Miles: " + info.getMiles());
        System.out.println("======================");
    }

    public CarInfo getInfo() {
        return info;
    }
}

