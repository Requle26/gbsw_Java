package ch07.ex03;

// abstract - 추상 클래스
// 실체 클래스(객체 생성용 클래스)들의
// 공통적안 툭성(필드, 메소드)을 추출하여 선언한 추상적인 클래스
// 추상 클래스로는 객체를 생성할 수 없다.

// A is a B -> A는 B다 (상속)
// A can B -> A는 B할 수 있다 (구현)
public abstract class Phone {

    // 필드
    public String owner;

    // 생성자
    public Phone(String owner) {
        this.owner = owner;
    }

    // 메소드
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}


