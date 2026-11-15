package ch07;

// public class B extends A
// B클래스는 A클래스를 상속받는다
// A 클래스가 부모 클래스
// B 클래스가 자식 클래스
public class SmartPhone extends Phone {

    // 자식 클래스 생성 시, 부모 클래스가 함께 생성된다.
    // 클래스 내 생성자를 작성하지 않은 경우, 이 작업은 자동으로 처리해준다.
    public SmartPhone() {
        super();
    }

    // 부모 클래스에 빈 생성자가 존재하지 않은 경우,
    // 자식 클래스에서 해당 생성자 모양에 맞게 직접 생성자를 호출하게끔
    // 작성해주어야 한다.
    public SmartPhone(String model, String color) {
        super(model, color);
    }
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
    public void touch() {
        System.out.println("화면을 터치합니다.");
    }

    // 부모 메서드를 오버라이드해 재정의할 수 있다.
    // 만약 기존의 해당 부모 메서드도 호출해야 하는 경우
    // 부모 객체를 가리키는 super 키워드 사용
    @Override
    void powerOn() {
        super.powerOn();
        System.out.println("스마트폰 전원을 켭니다.");
    }
}