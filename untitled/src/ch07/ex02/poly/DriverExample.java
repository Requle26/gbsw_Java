package ch07.ex02.poly;

public class DriverExample {
    static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

//        다형성(polymorphism)이란 하나의 타입으로 여러 종류의 객체를 다룰 수 있는 특성
//        쉽게 말해, 서로 다른 자식 객체들을 하나의 부모 타입으로 다룰 수 있다는 뜻

//        drive() 메서드는 Vehicle 타입의 매개변수를 받도록 정의되어 있다.
//        하지만 Taxi와 Bus는 모두 Vehicle 클래스를 상속받은 자식 클래스이므로,
//        자동으로 Vehicle 타입으로 자동형변환(업캐스팅)되어 전달할 수 있다.

//        즉, Taxi, Bus, Airplane 등 Vehicle을 상송바등ㄴ 이동수단마다
//        drive() 메서드를 따로 만들 필요 없이,
//        하나의 Vehicle 타입으로 여러 종류의 자식 객체를 전달받아 사용할 수 있다.
//        이처럼 하나의 부모타입으로 다양한 자식 객체를 다룰 수 있는 특성을 다형성이라고 한다.

        driver.drive(vehicle);
        driver.drive(bus);
        driver.drive(taxi);

    }
}
