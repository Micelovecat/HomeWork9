package ru.skypro;

public class Book {
    private String name;
    private String author;
    private int yearOfIssie;

    public Book(String name, String Author, int yearOfIssie) {
        this.name = name;
        this.author = Author;
        this.yearOfIssie = yearOfIssie;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfIssie() {
        return this.yearOfIssie;
    }

    public void setYearOfIssie(int yearOfIssie) {
        this.yearOfIssie = yearOfIssie;
    }



}
