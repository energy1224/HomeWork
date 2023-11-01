package com.iakovenko.javacore.lesson14;

import java.io.Serializable;

public class Task02 {

    public static  <T extends Cat & Eatable> void void01(T object){

        // ВОПРОС: методы каких типов можно вызвать у object ???
        // Ответ: Можно вызвать Cat, Kitten
    }

    public static  <T extends Animal & Serializable> void void02(T object){
        // ВОПРОС: методы каких типов можно вызвать у object ???
        // Ответ: Можно вызвать  Dog,  Cat, Kitten

    }

    public static  <T extends Serializable & Runnable> void void03(T object){
        // ВОПРОС: методы каких типов можно вызвать у object ???
        // Ответ: Можно вызвать  Dog,  Cat, Kitten
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        Kitten kitten = new Kitten();
        Dog dog = new Dog();

        //  Task.</* ВОПРОС: какие типы можно указать ??? */>void01(/* ВОПРОС: какие типы можно передать ??? */);

        Task02.<Cat>void01(cat);
        Task02.<Cat>void01(kitten);
        Task02.<Kitten>void01(kitten);

      //  Task.</* ВОПРОС: какие типы можно указать ??? */>void02(/* ВОПРОС: какие типы можно передать ??? */);
        Task02.<Kitten>void02(kitten);
        Task02.<Cat>void02(kitten);
        Task02.<Cat>void02(cat);
        Task02.<Dog>void02(dog);



      //  Task02.<Dog>void03(/* ВОПРОС: какие типы можно передать ??? */);

        Task02.<Dog>void03(dog);

    }


}
