package ch07.protect2;

import ch07.protect1.ProtectedClass;

public class ProtectExample extends ProtectedClass {
    public void test() {
        System.out.println(super.publicVariable);

        // protected 접근 제한자가 적용되어 있고 외부 패키지이지만,
        // 해당 클래스를 상속받았기 떄문에 접근 가능
        System.out.println(this.protectedVariable);
        this.protectedMethod();
    }
}
