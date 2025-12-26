package me.nobugs.lesson.homeWork2.task3.thirdTaskBook;

public class Book {

    private String author;
    private String title;

    public Book(String someAuthor, String someTitle){
        this.author = someAuthor;
        this.title = someTitle;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void printInfo(){
        System.out.println("Автор книги: " + this.author + ", название книги: " + this.title);

    }

}
