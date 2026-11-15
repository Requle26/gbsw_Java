public class test {
    public void solution(int[] arr) {
        int totalSum = 0;
        double avg;
        int maxScore = 0;
        int maxScoreStu = 0;
        int minScore = arr[0];
        int minScoreStu = 0;
        int upperAvg = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            if (maxScore < arr[i]) {
                maxScore = arr[i];
                maxScoreStu = i + 1;
            }
            if (minScore > arr[i]) {
                minScore = arr[i];
                minScoreStu = i + 1;
            }
        }
        avg = (double) totalSum / arr.length;
        System.out.println("전체 학생의 점수 합계 : " + totalSum);
        System.out.println("전체 학생의 평균 점수 : " + avg);
        System.out.println("최고 점수와 해당 점수의 학생 번호 : " + maxScore + ", " + maxScoreStu);
        System.out.println("최저 점수와 해당 점수의 학생 번호 : " + minScore + ", " + minScoreStu);
    }

    public void solution2(int[][] arr) {
        String[] subject = {"국어", "영어", "수학"};
        int temp = 0;
        int subjectScore = 0;
        double avg2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                subjectScore += arr[j][i];
                temp += arr[i][j];
            }
            System.out.println(i + 1 + "번째 학생의 세 과목 총점 : " + temp);
            avg2 = (double) temp / arr[i].length;
            System.out.println(i + 1 + "번째 학생의 평균 : " + avg2);
            temp = 0;
            System.out.println(subject[i] + " 점수 합계 : " + subjectScore);
            subjectScore = 0;
        }
    }
    void main() {
        solution2(new int[][]{
                {80, 75, 90},
                {95, 85, 70},
                {60, 90, 85},
                {88, 92, 96}
        });
    }
}