package ru.netology.manager;

import ru.netology.domain.Movies;

public class MoviesManager {
    private Movies[] movies = new Movies[0];

    private int movieListLength = 10;
    public MoviesManager(int movieListLength) {
        this.movieListLength = movieListLength;
    }

    public MoviesManager() {
        this.movieListLength = movieListLength;
    }

    public void addMovie(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movies[] getAll() {
        Movies[] result = new Movies[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movies[] getLast10() {
        int resultLength;
        if (movies.length < movieListLength) {
            resultLength = movies.length;
        } else {
            resultLength = movieListLength;
        }
        Movies[] result = new Movies[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - 1 - i;
            result[i] = movies[index];
        }
        return result;
    }
}
