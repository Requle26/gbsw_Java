package ch06.capsule;

public class GetterSetter {
    private int field1;
    private String field2;
    private double field3;
    private String field4;
    private GetterSetter field5;


    // 캡슐화 및 Getter와 Setter 사용 시 장점
    // 1. 필드에 직접적인 접근과 수저을 막을 수 있다. (민감 정보 보호)
    // 2. 필드의 읽기/쓰기 과정에 검증, 로그 기록 등 부가 작업을 추가할 수 있다.

    // Getter
    // 1. 외부로 필드값을 전달하는 것이 목적
    // 2. 필드값을 가공해서 외부로 전달할 수도 있음

    // Setter
    // 외부의 값을 받아 필드의 값을 변경하는 것이 목적
    // 매개값 검증하여 유효한 값만 필드로 저장할 수 있음

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        if (field1 <= 100) {
            this.field1 = field1;
        }
    }
}
