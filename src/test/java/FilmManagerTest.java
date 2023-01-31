import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldFindAllFilms() {
        String film1 = "Film One";
        String film2 = "Film Two";
        String film3 = "Film Three";

        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film One", "Film Two", "Film Three"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilmsReverse() {
        String film1 = "Film One";
        String film2 = "Film Two";
        String film3 = "Film Three";

        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film Three", "Film Two", "Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilmsLimit() {
        String film1 = "Film One";
        String film2 = "Film Two";
        String film3 = "Film Three";
        String film4 = "Film Four";

        FilmManager manager = new FilmManager(20);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = {"Film One", "Film Two", "Film Three", "Film Four"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilmsReverseEqualLimit() {
        String film1 = "Film One";
        String film2 = "Film Two";
        String film3 = "Film Three";
        String film4 = "Film Four";

        FilmManager manager = new FilmManager(4);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = {"Film Four", "Film Three", "Film Two", "Film One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
