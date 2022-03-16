package ru.netology.poster;

public class Film {
    private int id;
    private String name;
    private String genre;
    boolean isPremiere;

    public Film(int id, String name, String genre, boolean isPremiere) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.isPremiere = isPremiere;
    }
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId(int id) {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public boolean isPremiere() {
//        return isPremiere;
//    }
//
//    public void setPremiere(boolean premiere) {
//        isPremiere = premiere;
//    }
}
