package ch07.ex02.instance_of;

import ch07.ex02.Child;
import ch07.ex02.Parent;

public class instanceofExample {
    public static void method1(Parent parent) {
        // parent 매개변수를 Child로 형변환하기 전에,
        // 해강 객체가 Child 타입인지 확인하기 때문에
        // 강제 형변환으로 인한 예외가 발생하지 않는다.-ㅁ
        if (parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method - Child로 변환되지 않음");
        }
    }
    public static void method2(Parent parent) {
        // parent 객체가 Child 타입인지, Parent 타입인지,
        // 혹은 또 다른 Parent를 상속받은 클래스 타입인지 확인되지 않아,
        // 만약 parent 객체가 Child 타입이 아니라면,
        // ㅁ]
        Child child = (Child) parent;
        System.out.println("method2 - Child로 변환 성공");
    }

    static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);
        Parent parentB = new Parent();
        method1(parentB);
        // Parent를 Chlid로 강제 형변환하는 과정에서
        // ClassCastException 예외 발생
//        method2(parentB);
    }
}
