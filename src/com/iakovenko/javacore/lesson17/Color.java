package com.iakovenko.javacore.lesson17;

public enum Color {
    RED("красный"),
    GREEN("зеленый"),
    BLACK("чёрный");


    private String name;

    Color(String name) {
        this.name = name;
    }
}
