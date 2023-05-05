package ru.sosadwaden.libraryCRUD.models;

public class Person {

    private int id;

    private String full_name;

    private int year_of_birth;

    /**
     * Пустой конструктор для Spring
     */
    public Person() {

    }

    public Person(int id, String full_name, int year_of_birth) {
        this.id = id;
        this.full_name = full_name;
        this.year_of_birth = year_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", full_name=" + full_name +
                ", year_of_birth='" + year_of_birth + '\'' +
                '}';
    }
}
