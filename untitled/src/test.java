import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int students = scanner.nextInt();
        System.out.println("");
        int[] arr = new int[students];
        for (int i = 0; i < students; i++) {
            System.out.print(i+1 + " 번째 학생 점수 입력 : ");
            int scores = scanner.nextInt();
            arr[i] = scores;
        }
        int total = 0;
        int max = 0;
        int min = 0;
        int goodBrainStudent = 0;
        System.out.println();
        System.out.println("[점수 목록]");
        for(int score:arr) {
            System.out.println(score);
            total += score;
            if (score > max) {
                max = score;
                min = max;
            }
            if (score < min) {
                min = score;
            }
        }
        double avg = total/students;
        for(int score:arr) {
            if (score >= avg) {
                goodBrainStudent++;
            }
        }
        System.out.println("");
        System.out.println("총점 : " + total);
        System.out.printf("평균 : ");
        System.out.printf("%.1f", avg);
        System.out.println("");
        System.out.println("최고점 : " + max);
        System.out.println("최저점 : " + min);
        System.out.println("평균 이상 학생 수 : " + goodBrainStudent + "명");

    }
}
