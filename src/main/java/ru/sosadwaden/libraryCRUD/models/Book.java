package ru.sosadwaden.libraryCRUD.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id;

    @NotEmpty(message = "Название книги не должно быть пустым")
    @Size(min = 2, max = 100, message = "Длина названия должна быть от 2 до 100 символов")
    private String title;
    @NotEmpty(message = "ФИО автора не должно быть пустым")
    @Size(min = 2, max = 100, message = "Длина ФИО должен быть от 2 до 80 символов")
    private String author;

    @Min(value = 1500, message = "Книга должна быть старше 1500-го года")
    private int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
