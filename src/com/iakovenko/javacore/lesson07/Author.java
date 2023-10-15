package com.iakovenko.javacore.lesson07;

public class Author {

    public long id;
    public String name;

    public Author(){}

    public Author(long authorId){
        this.id = authorId;
    }

    public Author(long authorId, String name){
        this(authorId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.print("Автор: id= " + id + ", name= " + name);
    }

    public String getInfo(){

        return "Автор: id= " + id + ", name= " + name;
    }
    public void getInfo(String prefix){
        if (prefix == null) return;
        System.out.print(prefix + "Автор: id= " + id + ", name= " + name);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

