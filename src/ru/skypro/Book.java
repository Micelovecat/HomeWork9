package ru.skypro;

public class Book {
    private final Author author;
    private final String name;
    private int yearOfIssie;

    public Book(Author author, String name, int yearOfIssie) {
        this.author = author;
        this.name = name;
        this.yearOfIssie = yearOfIssie;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfIssie() {
        return yearOfIssie;
    }

    public void setYearOfIssie(int yearOfIssie) {
        this.yearOfIssie = yearOfIssie;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", yearOfIssie=" + yearOfIssie +
                '}';
    }
}
