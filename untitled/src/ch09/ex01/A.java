package ch09.ex01;

public class A {
    int a = 10;
    // 인스턴스 맴버 클래스
    // static 키워드 없이 중첩 선언된 클래스
    // JDK 15 이전 - 중첩 클래스 내 static 키워드 사용 불가
    // JDK 16 이후 - 중첩 클래스 내 static 키워드 사용 가능
     class B {
        B() {}
        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }

    static class C {
        C() {}
        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }

    void method() {
         class D {
             D() {}
             int field1;
             static int field2;
             void method1() {}
             static void method2 () {}
         }

         D d = new D();
         d.field1 = 3;
         d.method1();

    }
}
