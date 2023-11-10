package com.iakovenko.javacore.lesson17;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bob");
        strings.add("Tom");
        strings.add("Don");
        strings.add("Jon");
        strings.add("Alf");
        strings.add("Bob");
        strings.add("Tom");
        strings.add("Don");
        strings.add("Jon");
        strings.add("Alf");
        strings.add("Bob");
        strings.add("Tom");
        strings.add("Don");
        strings.add("Jon");
        strings.add("Alf");

        Map<String, Long> repeatingStrings = countRepeatedStrings(strings);

        System.out.println(repeatingStrings);

//        System.out.println(repeatingStrings.size());
//        System.out.println(repeatingStrings.get("Alf"));

//        Collection<Long> stringValue = repeatingStrings.values();
//        System.out.println(stringValue);

//        Set<Map.Entry<String, Long>> doubleStrings = repeatingStrings.entrySet();
//        for (Map.Entry<String, Long> pairs : doubleStrings) {
//            System.out.println(pairs.getValue());
//            System.out.println(pairs.getKey());
//        }
    }


    // Задача 1   Реализовать статический метод, который принимает Collection<String> strings
    //   и возвращает количество одинаковых слов в коллекции strings в виде Map<String, Long>.
    //   Где ключи - слова, а значения - количество повторений.

    public static Map<String, Long> countRepeatedStrings(Collection<String> strings) {

        Map<String, Long> repeatingStrings = new HashMap<>();
        ArrayList<String> strings1 = new ArrayList<>(strings);

        long value;
        for (int i = 0; i < strings.size(); i++) {
            if (repeatingStrings.getOrDefault(strings1.get(i), -1L) == -1) {
                value = 1;
                repeatingStrings.put(strings1.get(i), value);
            } else {
                value = repeatingStrings.get(strings1.get(i)) + 1;
                repeatingStrings.put(strings1.get(i), value);
            }
        }
        return repeatingStrings;
    }


}




