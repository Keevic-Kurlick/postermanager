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

    public void findAll() {
        for (Film film : films) {
            System.out.println(film.getFilm());
        }
    }

    public void findLast(int limit) {
        if (limit < films.length) {
            for (int i = films.length - 1; i >= films.length - limit; i--) {
                System.out.println(films[i].getFilm());
            }
        } else {
            for (int i = films.length - 1; i >= 0; i--) {
                System.out.println(films[i].getFilm());
            }
        }
    }

    public void findLast() {
        if (films.length >= 10) {
            for (int i = films.length - 1; i >= films.length - 10; i--) {
                System.out.println(films[i].getFilm());
            }
        } else {
            for (int i = films.length - 1; i >= 0; i--) {
                System.out.println(films[i].getFilm());
            }
        }
    }
}
