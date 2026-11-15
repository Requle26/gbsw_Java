package Exam.port4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentExample {
    public static void main(String[] args){
        //배열과 배열리스트의 차이
        //배열의 경우 크기가 고정적이다.
        // - 확장이 필요한 경우 새로운 배열을 만들고 옮겨줘야 한다.
        // - 다루는 데이터가 고정적일 때 배열을 쓰는 것이 적합
        //배열 리스트의 경우 크기가 동적이다.
        // - 확장을 알아서 해주고, 원하는 곳에 데이터를 간단하게 추가할 수 있다.
        // - 다루는 데이터의 길아나 내용이 변경될 수 있을 때 적합

        //배열리스트에 데이터 추가하기
        // add(t):이 때 t는 해당 배열 리스트에서 다루는 자료형과 동일해야함
        //배열리스트의 i번째 데이터 조회하기
        //get(i): 1번째 인덱스의 데이터 조회(반환)
        //배열리스트의 길이(원소 개수) 구하기
        // size():해당 배열리스트 내 원소 개수 반환
        ArrayList<Student> students=new ArrayList<>();

        students.add (new Student("김민수",90, 1));
        students.add (new Student("이서연",85,2));
        students.add (new Student("박지훈",95,3));
        //일반 for 문
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        //향상된 for 문
        //for (B b : a)
        //a : 배열 / 리스트 데이터
        //b: 현재 순회 중인 a 배열/리스트 데이터의 원소
        //B: a배열 / 리스트에서 다루는 데이터의 자료형
        for(Student student:students){
            System.out.println(student.getName());
        }


        // 90점 이상인 학생 출력
        // {name}은 {score}점으로 우수학생입니다. 출력
        // 우수학생이 발견될 때 마다 출력
        for (Student student : students) {
            if (student.getScore() >= 90) {
                System.out.println(student.getName() + "은 " + student.getScore() + "점으로 우수학생입니다.");
            }
        }


        // 90점 이상인 학생의 수 출력
        // "우수 학생은 총 {count}명 입니다." 출력
        // - 우수학생이 발견될 때 마다 기록만 하고 최종 한 번만 출력
        int total = 0;
        for (Student student : students) {
            if (student.getScore() >= 90) {
                total++;
            }
        }
        System.out.println("우수 학생은 총 " + total + "명 입니다.");


        // 점수가 제일 높은 학생 정보 출력
        // "점수가 제일 높은 학생은 {이름}이고, 점수는 {점수}점 입니다." 출력
        Student bestSt = null;
        for (Student student : students) {
            if (bestSt == null || bestSt.getScore() < student.getScore()) {
                bestSt = student;
            }
        }
        System.out.println("점수가 제일 높은 학생은 " + bestSt.getName() + "이고, 점수는 " + bestSt.getScore() + "점 입니다.");


        // 이름이 '?' 인 학생 찾기
        // 만약 동일 이름의 학생이 존재한다면, id가 낮은 데이터를 선택,
        // (리스트 내 id가 낮은 순으로 정렬되어 있다고 가정)
        // 학생을 찾은 경우 "학번: {학번}, 이름: {이름}, 점수: {점수}" 출력
        // 학생을 찾지 못한 경우: "해당 학생을 찾을 수 없습니다." 출력
        String searchName = "이서연";
        Student searchSt = null;
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                searchSt = student;
                break;
            }
        }
        System.out.println("학번: " + searchSt.getStudentNo() + ", 이름: " + searchSt.getName() + ", 점수: " + searchSt.getScore());
    }
}
