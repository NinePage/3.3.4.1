package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movies;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    Movies movie1 = new Movies(1, 1, "Movie1", "Genre1", "URL1");
    Movies movie2 = new Movies(2, 2, "Movie2", "Genre2", "URL2");
    Movies movie3 = new Movies(3, 3, "Movie3", "Genre3", "URL3");
    Movies movie4 = new Movies(4, 4, "Movie4", "Genre4", "URL4");
    Movies movie5 = new Movies(5, 5, "Movie5", "Genre5", "URL5");
    Movies movie6 = new Movies(6, 6, "Movie6", "Genre6", "URL6");
    Movies movie7 = new Movies(7, 7, "Movie7", "Genre7", "URL7");
    Movies movie8 = new Movies(8, 8, "Movie8", "Genre8", "URL8");
    Movies movie9 = new Movies(9, 9, "Movie9", "Genre9", "URL9");
    Movies movie10 = new Movies(10, 10, "Movie10", "Genre10", "URL10");
    Movies movie11 = new Movies(11, 11, "Movie11", "Genre11", "URL11");

    MoviesManager manager = new MoviesManager();

    @Test
    public void addMovie() {
        manager.addMovie(movie8);
        manager.addMovie(movie10);
        manager.addMovie(movie9);

        Movies[] expected = new Movies[]{movie9, movie10, movie8};
        Movies[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void allMovies() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        Movies[] expected = new Movies[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movies[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void last10Movie() {
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        Movies[] expected = new Movies[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movies[] actual = manager.getLast10();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void last11Movies() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);

        Movies[] expected = new Movies[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        Movies[] actual = manager.getLast10();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void last7Movies() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        Movies[] expected = new Movies[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movies[] actual = manager.getLast10();

        assertArrayEquals(expected, actual);
    }
}
