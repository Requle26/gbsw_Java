package ch07.final_example;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("차를 멈춘다");
        speed = 0;
    }
}
