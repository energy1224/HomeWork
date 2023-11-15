package com.iakovenko.javacore.lesson19.task3;

import java.time.LocalDate;

public class Author {

    private final String name;
    private final String email;
    private LocalDate birth;

    public Author(String name, String email, LocalDate birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name ;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}


