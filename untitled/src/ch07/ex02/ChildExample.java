package ch07.ex02;

public class ChildExample {
    static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        // 자식 클래스에 오버라이드가 있는 경우, 해당 메서드 우선 실행
        parent.method2();
//        parent.method3(); // 현재 부모 타입으로 인식되어 해당 메서드 사용 불가
        Child newChild = (Child) parent;
        newChild.method1();
        newChild.method2();
        newChild.method3();
    }
}
