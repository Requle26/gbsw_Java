package student_manage;

import freeStud.Student;

public class StudentExample {
    static void main(String[] args) {
        Student_gbsw[] students = {
                new Student_gbsw(1, "김철수", 80, 90, 85),
                new Student_gbsw(2, "이영희", 95, 85, 90),
                new Student_gbsw(3, "박민수", 70, 75, 80),
                new Student_gbsw(4, "최유진", 90, 95, 100),
                new Student_gbsw(5, "정하늘", 85, 80, 75),
        };

        int totalKorean = 0;
        int totalEnglish = 0;
        int totalMath = 0;
        double goodStudentAvg = 0.0;
        Student_gbsw goodStu = null;


        System.out.println("번호  이름  국어  영어  수학");
        for (Student_gbsw student : students) {
            System.out.print(student.studentId + "   ");
            System.out.print(student.name + "  ");
            System.out.print(student.korean + "   ");
            System.out.print(student.english + "  ");
            System.out.println(student.math);

            totalKorean += student.korean;
            totalEnglish += student.english;
            totalMath += student.math;
            if (goodStu == null || (double) (student.korean + student.english + student.math) / 3 > goodStudentAvg) {
                goodStudentAvg = (double) (student.korean + student.english + student.math) / 3;
                goodStu = student;
            }
        }

        double avgKorean = (double) totalKorean / students.length;
        double avgEnglish = (double) totalEnglish / students.length;
        double avgMath = (double) totalMath / students.length;
        System.out.println();
        System.out.println("국어 평균 : " + avgKorean + "점");
        System.out.println("영어 평균 : " + avgEnglish + "점");
        System.out.println("수학 평균 : " + avgMath + "점");
        System.out.println();
        System.out.println("전체 과목 평균이 가장 높은 학생은 " + goodStu.name + "입니다.");
        System.out.println(goodStu.name + "의 평군 점수는 " + goodStudentAvg + "점입니다.");
        System.out.println();

        System.out.println("평균 점수가 80점 이상인 학생:");
        for (Student_gbsw student : students) {
            if ((double) (student.english + student.korean + student.math) / 3 >= 80) {
                System.out.println(student.name);
            }
        }

        System.out.println();

        Student_gbsw lowMath = null;

        for (Student_gbsw student : students) {
            if (lowMath == null || lowMath.math > student.math) {
                lowMath = student;
            }
        }

        System.out.println("수학 점수가 가장 낮은 학생은 " + lowMath.name);
        System.out.println(lowMath.math + "점입니다.");

    }
}
