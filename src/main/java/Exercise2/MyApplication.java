package Exercise2;

public class MyApplication {

    public static void main(String[] args) {

        Car car = new Car(4, "Ford");
        Truck truck = new Truck(8, "Foton");

        car.startEngine();
        car.refuel();

        truck.startEngine();
        truck.refuel();

        System.out.println();

        destroyVehicle(car);
        destroyVehicle(truck);
    }

    public static void destroyVehicle(Vehicle v) {
        v.destroy();
    }
    
}



