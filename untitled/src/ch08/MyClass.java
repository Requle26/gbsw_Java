package ch08;

public class MyClass {
    // 인터페이스도 클래스와 마찬가지로 하나의 타입으로 취급된다.
    // 따라서 변수 타입, 반환 타입, 매개변수 타입 등으로 사용될 수 있다.

    // 필드
    RemoteControl rc = new Television();

    // 생성자
    MyClass() {}

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    // 메서드
    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc) {
        rc.turnOn();;
        rc.setVolume(5);
    }
}
