package ch07;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone 객체 생성
        Phone phone = new Phone();
        phone.color = "검정";
        phone.model = "삼성";
        phone.powerOn();
//        phone.internet();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.color = "검정";
        smartPhone.model = "삼성";
        smartPhone.powerOn();
        smartPhone.internet();
    }
}