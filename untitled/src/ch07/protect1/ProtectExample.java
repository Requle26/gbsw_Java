package ch07.protect1;

public class ProtectExample {
    static void main(String[] args) {
        ProtectedClass pc = new ProtectedClass();

        // private 필드 제외하고 모두 접근 가능
        System.out.println(pc.publicVariable);
        System.out.println(pc.protectedVariable);
        System.out.println(pc.defaultVariable);
    }
}
