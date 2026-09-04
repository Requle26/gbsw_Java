import java.util.Scanner;

public class DynamicArrayHeight {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 키의 수를 입략하세요. : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];

        while (n > 0) {
            int index = arr.length - n;
            System.out.print((index + 1) + "번째 키를 입력하세요. : ");
            int height = scanner.nextInt();
            scanner.nextLine();
            arr[index] = height;
            n--;
        }
        System.out.println("[키 리스트]");
        for (int heigth : arr) {
            System.out.println(heigth);
        }

        int sum = 1500;
        int count = 16;

        //단순 Int형 변수끼리 연산 후 실수형 변수에 대입해도 소수점 계산이 되지 않음
        //ex) 16/3 = 5.333333...이지만, 둘 다 정수형이라면 몫인 5만 저장됨.
        //이를 실수형으로 변환해도 5.0이 되고 소수점이 복원되지는 않음

        double avg = sum / count;
    }
}
