package com.iakovenko.javacore.lesson07;


import java.util.Arrays;

public class Book {

    private String name;
    private boolean isPublished;
    private Author[] authors;


    // numberOfAuthors - размер массива authors
    // значение numberOfAuthors должно находиться в диапазоне [1, 5)
    public Book(String name, int numberOfAuthors) {
        setName(name);
        if (numberOfAuthors < 1 || numberOfAuthors >= 5) {
            throw new IllegalArgumentException("значение numberOfAuthors должно находиться в диапазоне [1, 5)");
        }
        authors = new Author[numberOfAuthors];
    }


    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }

    public Author[] getAuthors() {

        return authors;
    }

    public String getName() { // Getter
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", isPublished=" + isPublished +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }

    public void addAddAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("author not null");
        }
        if(authors[getAuthors().length-1] != null) {
            System.out.println("Список соавторов уже заполнен");
            return;
        }

        int index = 0;
        while (index < getAuthors().length) {
            if (authors[index] == null) {
                authors[index] = author;
                return;
              //  break;
            } else if (authors[index].equals(author)) {
                System.out.println("Автор " + author.getName() + " уже есть в списке соавторов.");
               // break;
                return;
            }// else
                index++;

        }

    }
}
