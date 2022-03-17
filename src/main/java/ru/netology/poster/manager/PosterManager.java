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
        int length = films.length;

        if (limit < length) {
            lastFilms = new Film[limit];

            for (int i = length - 1; i >= length - limit; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        } else {
            lastFilms = new Film[length];

            for (int i = length - 1; i >= 0; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        }

        return lastFilms;
    }
}
