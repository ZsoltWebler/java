package test_exam_1.java_database.tests;

import org.junit.jupiter.api.Test;
import test_exam_1.java_database.model.MovieDao;

import static org.junit.Assert.assertEquals;

public class MovieDaoTest {

    @Test
    public void testMovieImdbScoreMinValueHasToBeZero() {
        MovieDao movie = new MovieDao("TesztFilm", -1.0, 1);
        double expected = 0.0;

        assertEquals(expected, movie.getImdbScore(), 0);
    }

    @Test
    public void testMovieImdbScoreMaxValueHasToBeTen() {
        MovieDao movie = new MovieDao("TesztFilm", 11.0, 1);
        double expected = 10.0;

        assertEquals(expected, movie.getImdbScore(), 0);
    }

}
