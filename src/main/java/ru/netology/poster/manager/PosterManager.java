package ru.netology.poster.manager;

import ru.netology.poster.domain.Film;

public class PosterManager {
    private int limit = 10;
    private Film[] films = new Film[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {

    }

    public void save(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        Film[] lastFilms;
        int copyToIndex = 0;
        int lengthOfFilms = films.length;
        int length = limit < lengthOfFilms ? limit : lengthOfFilms;

        lastFilms = new Film[length];

        for (int i = lengthOfFilms - 1; i >= lengthOfFilms - length; i--) {
            lastFilms[copyToIndex] = films[i];
            copyToIndex++;
        }
        return lastFilms;
    }
}
