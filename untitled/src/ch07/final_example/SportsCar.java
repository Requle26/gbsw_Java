package ch07.final_example;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        this.speed += 10;
    }

//    Car.stop() 메서드는 final 메서드이기 때문에
//    오버라이드(재정의)할 수 없다.
//    public void stop() {
//        System.out.println("스포프카를 멈춘다");
//        speed = 0;
//    }
}
