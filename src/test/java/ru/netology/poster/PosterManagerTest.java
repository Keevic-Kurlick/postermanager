package ru.netology.poster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    Film first = new Film(2, "Film", "Film", true);
    Film second = new Film(2, "Film", "Film", true);
    Film forth = new Film(3, "Film", "Film", false);
    Film fifth = new Film(3, "Film", "Film", false);
    Film sixth = new Film(3, "Film", "Film", false);
    Film first1 = new Film(2, "Film", "Film", true);
    Film second1 = new Film(2, "Film", "Film", true);
    Film forth1 = new Film(3, "Film", "Film", false);
    Film fifth1 = new Film(3, "Film", "Film", false);
    Film sixth1 = new Film(3, "Film", "Film", false);
    Film sixth2 = new Film(3, "Film", "Film", false);

    @Test
    public void shouldAddIfNull() {
        PosterManager poster = new PosterManager();
        poster.save(null);

        Film[] expected = {null};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddIfContainsOne() {
        PosterManager poster = new PosterManager();
        poster.save(first);

        Film[] expected = {first};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddIfAlreadyContainsMany() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);

        poster.save(forth);

        Film[] expected = {first, second, forth};
        Film[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimitLargerFilmsLength() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);

        Film[] expected = {sixth, fifth, forth, second, first};
        Film[] actual = poster.findLast(6);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimitEqualFilmsLength() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);

        Film[] expected = {sixth, fifth, forth, second, first};
        Film[] actual = poster.findLast(5);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastLimitLowerFilmsLength() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);

        Film[] expected = {sixth, fifth, forth, second};
        Film[] actual = poster.findLast(4);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNoLimitAndUnder10() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);

        Film[] expected = {sixth, fifth, forth, second, first};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNoLimitAndEqual10() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);
        poster.save(first1);
        poster.save(second1);
        poster.save(forth1);
        poster.save(fifth1);
        poster.save(sixth1);

        Film[] expected = {sixth1, fifth1, forth1, second1, first1, sixth, fifth, forth, second, first};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastNoLimitAndOver10() {
        PosterManager poster = new PosterManager();

        poster.save(first);
        poster.save(second);
        poster.save(forth);
        poster.save(fifth);
        poster.save(sixth);
        poster.save(first1);
        poster.save(second1);
        poster.save(forth1);
        poster.save(fifth1);
        poster.save(sixth1);
        poster.save(sixth2);

        Film[] expected = {sixth2, sixth1, fifth1, forth1, second1, first1, sixth, fifth, forth, second};
        Film[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }
}