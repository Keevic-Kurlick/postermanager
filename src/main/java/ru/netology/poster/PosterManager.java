package ru.netology.poster;

public class PosterManager {
    private Film[] films = new Film[0];

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

    public Film[] findLast(int limit) {
        Film[] lastFilms;
        int copyToIndex = 0;

        if (limit < films.length) {
            lastFilms = new Film[limit];

            for (int i = films.length - 1; i >= films.length - limit; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        } else {
            lastFilms = new Film[films.length];
            for (int i = films.length - 1; i >= 0; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        }
        return lastFilms;
    }

    public Film[] findLast() {
        Film[] lastFilms;
        int copyToIndex = 0;

        if (films.length >= 10) {
            lastFilms = new Film[10];

            for (int i = films.length - 1; i >= films.length - 10; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        } else {
            lastFilms = new Film[films.length];
            for (int i = films.length - 1; i >= 0; i--) {
                lastFilms[copyToIndex] = films[i];
                copyToIndex++;
            }
        }
        return lastFilms;
    }
}
