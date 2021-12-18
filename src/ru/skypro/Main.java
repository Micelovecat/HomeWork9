package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String nameWarAndPeace = "Война и мир";
        String authorWarAndPeace = "Л.Н. Толстой";
        String firstNameAuthorWarAndPeace = "Лев";
        String lastNameAuthorWarAndPeace = "Толстой";
        int yearOfIssieWarAndPeace = 1996;

        String nameIdiot = "Идиот";
        String authorIdiot = "Ф.М. Достоевский";
        String firstNameAuthorIdiot = "Федор";
        String lastNameAuthorIdiot = "Достоевский";
        int yearOfIssieIdiot = 1990;

        String[] names = {"Война и мир", "Идиот"};
        String[] authors = {"Л.Н. Толстой", "Ф.М. Достоевский"};
        String[] firstNameAuthors = {"Лев", "Федор"};
        String[] lastNameAuthors = {"Толстой", "Достоевский"};
        int[] yearsOfIssie = {1996, 1990};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Произведение - " + names[i] + "/ /Автор - " + authors[i] + "/ /Имя автора - " + firstNameAuthors[i] + "/ /Фамилия автора - " + lastNameAuthors[i] + "/ /Год издания - " + yearsOfIssie[i]);

        }


        Author lev = new Author();
        lev.firstNameAuthor = "Лев";
        System.out.println("fedor.firstNameAuthor = " + lev.firstNameAuthor);
        Author tolstoy = new Author();
        tolstoy.lastNameAuthor = "Толстой";
        System.out.println("tolstoy.lastNameAuthor = " + tolstoy.lastNameAuthor);
        Author fedor = new Author();
        fedor.firstNameAuthor = "Федор";
        System.out.println("fedor.firstNameAuthor = " + fedor.firstNameAuthor);
        Author dostoevsky = new Author();
        dostoevsky.lastNameAuthor = "Достоевский";
        System.out.println("dostoevsky.lastNameAuthor = " + dostoevsky.lastNameAuthor);


    }
}
