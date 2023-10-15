package com.iakovenko.javacore.lesson07;

import java.util.Arrays;

public class Lesson07 {
    public static void main(String[] args) {

        System.out.println("Задача список авторов");
        System.out.println("______________________");
        Author author01 = new Author(1, "Artur");
        Author author02 = new Author(2, "Jack");
        Author author03 = new Author(3, "Jon");
        Author author04 = new Author(4,"Agata");

        Book book01 = new Book("Java", 3);
        System.out.println(Arrays.toString(book01.getAuthors()));

        book01.addAddAuthor(author01);
        book01.addAddAuthor(author02);
        book01.addAddAuthor(author01); // выдает Автор Artur уже есть в списке соавторов.
        book01.addAddAuthor(author04);
        book01.addAddAuthor(author03);// Список соавторов уже заполнен

        System.out.println(Arrays.toString(book01.getAuthors()));

       // Book book02 = new Book("Python", 9); // выдает Exception. хорошо


        System.out.println("______________________");
        System.out.println("Задача 'Битва котов'");
        System.out.println("______________________");

        Cat cat01 = new Cat(2);
        Cat cat02 = new Cat(4);
       // Cat cat03 = new Cat(12); // выдает Exception. хорошо
        System.out.println(cat01.getName());
        //cat01.setName("A n"); выдает Exception. хорошо
        cat01.setName("Bella");
        System.out.println(cat01.getName());
        cat01.setWeight(8);
        System.out.println(cat01.attack(cat02));
        System.out.println(cat01.getWin());
        System.out.println(cat02.getWin());















    }
}
