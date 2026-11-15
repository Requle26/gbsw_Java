package ch07.protect1;

public class ProtectedClass {
    // public -> protected -> default -> private 순으로 접근 제한이 강화된다.

    // Public 접근 제한자
    // - 패키지 구분 없이 항상 참조/접근 가능
    public int publicVariable;

    // Protected 접근 제한다
    // - 같은 패키지 내에서는 참조/접근 가능
    // - 외부 패키지인 경우 이 클래스의 자식 클래스만 참조/접근 가능
    protected int protectedVariable;

    // Default 접근 제한자
    // - 같은 패키지 내에서는 참조/접근 가능
    int defaultVariable;

    // Private 접근 제한자
    // - 같은 클래스 내부가 아니면 참조/접근 불가능
    private int privateVariable;

    protected void protectedMethod() {
    }
}