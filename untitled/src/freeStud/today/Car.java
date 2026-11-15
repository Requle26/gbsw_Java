package freeStud.today;

public class Car extends Vehicle{
    public Car(String model) {
        super(model);
    }
    public void drive() {
        System.out.println("자동차가 달립니다.");
    }
}
