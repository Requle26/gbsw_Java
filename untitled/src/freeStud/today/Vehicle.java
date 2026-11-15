package freeStud.today;

public class Vehicle {
    protected String model;
    public Vehicle(String model) {
        this.model = model;
    }
    public void move(){
        System.out.println("이동합니다.");
    }
}
