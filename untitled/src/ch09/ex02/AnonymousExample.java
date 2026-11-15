package ch09.ex02;

public class AnonymousExample {
    static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.wake();

        // 익명 객체 또한 객체와 동일하게 값처럼 다뤄질 수 있다.
        // 다만 익명 상속 객체같은 경우, 추가 필드/메서드 등을 구현하더라도,
        // 익명 객체 내부에서만 참조 가능하고,
        // 외부에서는 부모 클래스의 필드/메서드만 참조 가능하다

        // 필드에 저장된 익명 객체 사용
        anonymous.field.wake();

        // 로컬 변수에 저장된 익명 객체 사용
        anonymous.method1();

        // 매개 변수에 익명 객체 전달
        anonymous.method2(new Person() {
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });
    }
}
