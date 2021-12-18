package ru.skypro;

public class App1 {
    public static void main(String[] args) {
        String nameWarAndPeace = "Война и мир";
        String authorWarAndPeace = "Л.Н. Толстой";    //лишний параметр, не входящий в условие задачи
        String firstNameAuthorWarAndPeace = "Лев";
        String lastNameAuthorWarAndPeace = "Толстой";
        int yearOfIssieWarAndPeace = 1996;

        String nameIdiot = "Идиот";
        String authorIdiot = "Ф.М. Достоевский";      //лишний параметр, не входящий в условие задачи
        String firstNameAuthorIdiot = "Федор";
        String lastNameAuthorIdiot = "Достоевский";
        int yearOfIssieIdiot = 1990;

        String[] names = {"Война и мир", "Идиот"};
        String[] authors = {"Л.Н. Толстой", "Ф.М. Достоевский"};   //лишний параметр, не входящий в условие задачи
        String[] firstNameAuthors = {"Лев", "Федор"};
        String[] lastNameAuthors = {"Толстой", "Достоевский"};
        int[] yearsOfIssie = {1996, 1990};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Произведение - " + names[i] + "/ /Автор - " + authors[i] + "/ /Имя автора - " + firstNameAuthors[i] + "/ /Фамилия автора - " + lastNameAuthors[i] + "/ /Год издания - " + yearsOfIssie[i]);

        }


        AuthorApp1 lev = new AuthorApp1();
        lev.firstNameAuthor = "Лев";
        System.out.println("lev.firstNameAuthor = " + lev.firstNameAuthor);
        AuthorApp1 tolstoy = new AuthorApp1();
        tolstoy.lastNameAuthor = "Толстой";
        System.out.println("tolstoy.lastNameAuthor = " + tolstoy.lastNameAuthor);
        AuthorApp1 fedor = new AuthorApp1();
        fedor.firstNameAuthor = "Федор";
        System.out.println("fedor.firstNameAuthor = " + fedor.firstNameAuthor);
        AuthorApp1 dostoevsky = new AuthorApp1();
        dostoevsky.lastNameAuthor = "Достоевский";
        System.out.println("dostoevsky.lastNameAuthor = " + dostoevsky.lastNameAuthor);


    }
}
