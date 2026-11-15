package ch07.ex02.poly;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Taxi) {
            
        } else if (vehicle instanceof Bus) {

        }
        vehicle.run();
    }
}
