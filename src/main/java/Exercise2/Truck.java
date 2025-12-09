package Exercise2;

public class Truck extends Vehicle implements Refuelable {

    public Truck(int numberOfWheels, String brand) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine start");
    }

    @Override
    public void refuel() {
        System.out.println("Truck refueling");
    }
    
}


