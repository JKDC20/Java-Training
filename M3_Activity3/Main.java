package M3_Activity3;

public class Main {
    public static void main(String[] args) {

        // Car1 no args constructor
        Car car1 = new Car();
        car1.getInfo().setBrand("Ford");
        car1.getInfo().setModel("Mustang");
        car1.getInfo().setCondition("Used");
        car1.getInfo().setMiles(10000);

        // Car2 parameterized constructor
        Car car2 = new Car("BYD", "Sealion 5", "Brand New", 200);

        // Output of the cas specs
        System.out.println("Car 1 Specs:");
        car1.displayInfo();

        System.out.println("Car 2 Specs:");
        car2.displayInfo();
    }
}

