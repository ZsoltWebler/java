package test_exam_1.java_database.controller;

import test_exam_1.java_database.model.MovieDao;
import test_exam_1.java_database.repository.MovieCategoryRepository;
import test_exam_1.java_database.repository.MovieRepository;
import test_exam_1.java_database.view.Imdb;

public class ImdbController {

    MovieRepository movieRepository = new MovieRepository();
    MovieCategoryRepository movieCategoryRepository = new MovieCategoryRepository();

    public ImdbController() {

        Imdb imdb = new Imdb(this);

    }


    public void listMovies() {
        movieRepository.getAll().forEach(System.out::println);

    }

    public void listCategories() {
        movieCategoryRepository.getAll().forEach(System.out::println);
    }

    public void addMovie(MovieDao movieDao) {
        movieRepository.save(movieDao);
    }

}
