package Exercise2;

public class Car extends Vehicle implements Refuelable {

    public Car(int numberOfWheels, String brand) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine start");
    }

    @Override
    public void refuel() {
        System.out.println("Car refueling");
    }
    
}

