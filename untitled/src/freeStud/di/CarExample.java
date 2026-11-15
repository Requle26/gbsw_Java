package freeStud.di;

public class CarExample {
    static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.drive();

        Engine engine2 = new GasEngine();
        Car car2 = new Car(engine2);
        car2.drive();
    }
}
