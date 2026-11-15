class Solution {
    public void solution() {
        // books[학년번호][요일번호]
        int[][] books = {
                {12, 18, 15, 10},
                {20, 14, 16, 22},
                {15, 25, 18, 12}
        };

        int total = 0;

        System.out.println("[전체 도서 대출 현황]");
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[0].length; j++) {
                System.out.print(books[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("[학년별 총 대출 권수]");
        System.out.println();

        int maxClass = 0;
        int maxStu = 0;

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[0].length; j++) {
                total += books[i][j];
            }
            if (total > maxStu) {
                maxStu = total;
                maxClass = i + 1;
            }
            System.out.println((i + 1) + "학년 : " + total + "권");
            total = 0;
        }

        System.out.println();
        System.out.println();

        System.out.println("[요일별 총 대출 권수]");
        System.out.println();

        String[] yoil = new String[]{"월요일", "화요일", "수요일", "목요일"};

        int Cnt = 0;
        String maxYoil = "";
        int maxYoilBook = 0;

        for (int i = 0; i < books[0].length; i++) {
            for (int j = 0; j < books.length; j++) {
                total += books[j][i];
            }
            if (total > maxYoilBook) {
                maxYoil = yoil[i];
                maxYoilBook = total;
            }
            System.out.println(yoil[Cnt] + " : " + total + "권");
            total = 0;
            Cnt++;
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[0].length; j++) {
                total += books[i][j];
            }
        }
        System.out.println("전체 도서 대출 권수 : " + total + "권");

        System.out.println();
        System.out.println();

        System.out.println("대출 권수가 가장 많은 학년 : " + maxClass + "학년");
        System.out.println("대출 권수 : " + maxStu + "권");

        System.out.println();
        System.out.println();

        System.out.println("대출 권수가 가장 많은 요일 : " + maxYoil);
        System.out.println("대출 권수 : " + maxYoilBook + "권");
    }

    void main() {
        solution();
    }
}