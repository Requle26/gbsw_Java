package Exam;

import java.util.ArrayList;

public class MovieExample {
    static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(401, "인터스텔라", "SF", 12000, true));
        movies.add(new Movie(402, "기생충", "드라마", 11000, true));
        movies.add(new Movie(403, "겨울왕국", "애니메이션", 10000, false));
        movies.add(new Movie(404, "범죄도시", "액션", 13000, true));
        movies.add(new Movie(405, "라라랜드", "뮤지컬", 12000, false));


        System.out.println("[전체 영화 정보]");
        System.out.println();
        for (Movie movie : movies) {
            String status = "상영 종료";
            if (movie.isScreening()) {
                status = "상영 중";
            }
            System.out.println("영화번호 : " + movie.getMovieNo() + ", 영화명 : " + movie.getTitle() + ", 장르 : " + movie.getGenre() + ", 티켓 가격 : " + movie.getPrice() + ", 상영 여부 : " + status);
        }
        System.out.println();
        System.out.println("[영화 정보 변경]");
        System.out.println();

        for (Movie movie : movies) {
            if (movie.getMovieNo() == 402) {
                movie.setGenre("블랙코미디");
                System.out.println("402번 영화의 장르가 변경되었습니다.");
            }
            if (movie.getMovieNo() == 405) {
                movie.setScreening(true);
                System.out.println("405번 영화의 상영 여부가 변경되었습니다.");
            }
        }
        System.out.println();
        System.out.println("[상영 현황]");
        System.out.println();

        int ScreeningMovies = 0;
        for (Movie movie : movies) {
            if (movie.isScreening()) {
                ScreeningMovies += 1;
            }
        }
        System.out.println("상영 중인 영화 수 : " + ScreeningMovies + "편");

        System.out.println();
        System.out.println("[티켓 가격이 가장 높은 영화]");
        System.out.println();

        Movie maxMovie = movies.get(0);
        int maxPrice = movies.get(0).getPrice();
        for (Movie movie : movies) {
            if (movie.getPrice() > maxPrice) {
                maxMovie = movie;
                maxPrice = movie.getPrice();
            }
        }
        System.out.println("영화명 : " + maxMovie.getTitle());
        System.out.println("티켓 가격 : " + maxPrice + "원");

        System.out.println();
        System.out.println("[영화 검색]");
        System.out.println();

        int searchNo = 403;
        Movie searchMv = null;

        for (Movie movie : movies) {
            if (movie.getMovieNo() == searchNo) {
                searchMv = movie;
                String status = "상영 종료";
                if (searchMv.isScreening()) {
                    status = "상영 중";
                }
                System.out.println("영화명 : " + searchMv.getTitle());
                System.out.println("장르 : " + searchMv.getGenre());
                System.out.println("티켓 가격 : " + searchMv.getPrice() + "원");
                System.out.println("상영 여부 : " + status);
                break;
            }
        }
        if (searchMv == null) {
            System.out.println("영화를 찾을 수 없습니다.");
        }

    }
}
