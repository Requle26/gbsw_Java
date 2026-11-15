package ch07.ex03;

public class PhoneExample {
    static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
