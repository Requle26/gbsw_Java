package ch09.ex01;

public class MemberClass {

    // 인스턴스 맴버로, MemberClass 객체(인스턴스)가 존재해야 참조 가능
    int field1;
    void method1() {}

    // 정적 맴버로, 별도 객체 없이 MemberClass 클래스를 통해 참조 가능
    static int field2;
    static void method2() {}

    // 인스턴스 맴버 클래스로, 해당 클래스의 객체 생성은 MemberClass 객체 생성을 전제로 하기 떄문에,
    // MemberClass의 인스턴스/정적 맴버 모두 참조 가능
    class B {
        void method() {
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    // 정적 맴버 클래스로, 해당 클래스의 객체 생성은 MemberClass 객체가 없이도 생성 가능해야 하기 때문에,
    // MemberClass의 객체가 있어야만 참조 가능한 인스턴스 맴버는 사용할 수 없고, 정적 맴버만 사용 가능하다.
    static class C {
        void method() {
            // field1, method1()은 인스턴스 맴버로 MemberClass 클래스가 아닌 객체를 통해 참조 가능하다.
//            field1 = 10;
//            method1();
            field2 = 10;
            method2();
        }
    }
}
