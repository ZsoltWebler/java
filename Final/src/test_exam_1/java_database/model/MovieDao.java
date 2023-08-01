package test_exam_1.java_database.model;

public class MovieDao {

    private int movieId;
    private final String movieName;
    private final double imdbScore;
    private final int categoryId;


    public MovieDao(String movieName, double imdbScore, int categoryId) {
        this.movieId = -1;
        this.movieName = movieName;
        this.imdbScore = imdbScore;
        this.categoryId = categoryId;
    }

    public MovieDao(int movieId, String movieName, double imdbScore, int categoryId) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.imdbScore = imdbScore;
        this.categoryId = categoryId;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public int getCategoryId() {
        return categoryId;
    }

    @Override
    public String toString() {
        return "MovieDao{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", imdbScore=" + imdbScore +
                ", categoryId=" + categoryId +
                '}';
    }
}
