package freeStud.di;

public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("자동차 출발");
    }
}
