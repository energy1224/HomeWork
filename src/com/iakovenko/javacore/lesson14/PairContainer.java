package com.iakovenko.javacore.lesson14;

//Объявить класс PairContainer со свойствами key и value. key и value - generic свойства без ограничений, но могут быть разных типов.
//        Создать экземпляр PairContainer, где key - любые числа, value - строка
//        Создать экземпляр PairContainer, где key - строка, value - тип User, у которого id - любые числа
//        Создать экземпляр PairContainer, где key - строка, value - тип PairContainer, у которого key - любые числа, value - тип User, у которого id - строка
public class PairContainer<T, D> {
    private T key;
    private D value;
    public PairContainer(T key, D value) {
        this.key = key;
        this.value = value;

    }

    public T getKey() {
        return key;
    }

    public D getValue() {
        return value;
    }
}
 class Test{
    public static void main(String[] args) {

//        Создать экземпляр PairContainer, где key - любые числа, value - строка

        PairContainer<Number,String> pairContainer01 = new PairContainer<>(134.6,"147");

        //        Создать экземпляр PairContainer, где key - строка, value - тип User, у которого id - любые числа

        User<Number> user02= new User<>(456.6);
        PairContainer<String,Number> pairContainer03 = new PairContainer<>("134.6",user02.getId());

        //        Создать экземпляр PairContainer, где key - строка, value - тип PairContainer,
        //        у которого key - любые числа, value - тип User, у которого id - строка


        User<String> user04= new User<>("456");
        PairContainer<Number,String> pairContainer06= new PairContainer<>(0.465, user04.getId());
        PairContainer<String,String> pairContainer07 = new PairContainer<>("57",pairContainer06.getValue());














    }
}
