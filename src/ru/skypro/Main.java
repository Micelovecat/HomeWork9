package ru.skypro;

public class Main {


    public static void main(String[] args) {
        String nameWarAndPeace = "Война и мир";
        String authorWarAndPeace = "Л.Н. Толстой";   //лишний параметр, не входящий в условие задачи
        String firstNameAuthorWarAndPeace = "Лев";
        String lastNameAuthorWarAndPeace = "Толстой";
        int yearOfIssieWarAndPeace = 1996;

        String nameIdiot = "Идиот";
        String authorIdiot = "Ф.М. Достоевский";     //лишний параметр, не входящий в условие задачи
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


        Author authorFirstAndLastName1 = new Author("Лев", "Толстой");

        System.out.println("lev.firstNameAuthor = " + authorFirstAndLastName1.firstNameAuthor);
        System.out.println("tolstoy.lastNameAuthor = " + authorFirstAndLastName1.lastNameAuthor);


        Author authorFirstAndLastName2 = new Author("Федор","Достоевский");

        System.out.println("fedor.firstNameAuthor = " + authorFirstAndLastName2.firstNameAuthor);
        System.out.println("dostoevsky.lastNameAuthor = " + authorFirstAndLastName2.lastNameAuthor);


    }
}
