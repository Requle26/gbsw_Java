package freeStud.today;

public class Driver {
    private Car car;
    public Driver(Car car) {
        this.car = car;
    }
    public void driveCar() {
        car.drive();
    }
}
