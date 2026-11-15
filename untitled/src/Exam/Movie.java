package Exam;

public class Movie {
    public int getMovieNo() {
        return movieNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isScreening() {
        return screening;
    }

    public void setScreening(boolean screening) {
        this.screening = screening;
    }

    private final int movieNo;
    private String title;
    private String genre;
    private int price;
    private boolean screening;

    public Movie(int movieNo, String title, String genre, int price, boolean screening) {
        this.movieNo = movieNo;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.screening = screening;
    }
}
