package com.iakovenko.javacore.lesson17;

import java.util.*;

public class Tasks0204 {

    public static void main(String[] args) {

        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        String word = "Uncover";


//        Map<String, Long> repeatingStrings = countExactStrings(word,text);
//        System.out.println(repeatingStrings);
//
//
//        Map<Integer, List<String>> list = countLetters(text);
//        System.out.println(list);

        topRepeatedWords(text);


    }

    // задача 2  Реализовать статический метод, принимающий на вход String word и String text и
    //   возвращающий частоту встречаемости слова word в тексте text в виде Map<String, Long>.
    //   Где ключи - слова, а значения - частота встречаемости

    private static Map<String, Long> countExactStrings(String word, String text) {
        Map<String, Long> repeatingStrings = new HashMap<>();
        long value = 0;
        repeatingStrings.put(word, value);
        String[] textWords = text.split(" ");
        for (int i = 0; i < textWords.length; i++) {
            if (textWords[i].equalsIgnoreCase(word)) {
                value++;
                repeatingStrings.put(word, value);
            }

        }
        return repeatingStrings;
    }


    // задача 3 Реализовать статический метод, принимающий на вход String text и возвращающий Map<Integer,
    //  List<String>>где ключи - количество букв в словах, значения - списки соответствующих слов.


    private static Map<Integer, List<String>> countLetters(String text) {
        Map<Integer, List<String>> list = new HashMap<>();
        String[] textWords = text.split(" ");
        for (int i = 0; i < textWords.length; i++) {
            Integer num = textWords[i].length();
            if (list.containsKey(num)) {
                list.get(num).add(textWords[i]);
            } else {
                list.put(num, new ArrayList<>());
                list.get(num).add(textWords[i]);
            }
        }
        return list;
    }

    // задача 4
    //Реализовать статический void метод, принимающий на вход String text и
    //   выводящий в консоль топ 10 самых часто встречаемых в тексте слов
    //   (можно добавить условие: артикли и предлоги не считаем за слова).

    private static void topRepeatedWords(String text) {
        Map<String, Long> repeatingStrings;
        Map<String, Long> sortedMap = new HashMap<>();
        String[] textWords = text.split(" ");
        ArrayList<String> wordsList = new ArrayList<>();
        for (int i = 0; i < textWords.length; i++)
            wordsList.add(textWords[i]);
        repeatingStrings = Task01.countRepeatedStrings(wordsList);

        ArrayList<Long> valueList = new ArrayList<>();
        Set<Map.Entry<String, Long>> repeatedString = repeatingStrings.entrySet();
        for (Map.Entry<String, Long> repeatedWord : repeatedString)
            valueList.add(repeatedWord.getValue());
        Collections.sort(valueList);
        Collections.reverse(valueList);
        Set<Long>numList = new HashSet<>(valueList);
        System.out.println(numList);



        for (Long num: numList) {
            System.out.println(num);
            for (Map.Entry<String, Long> repeatedWord : repeatedString)
                if (repeatedWord.getValue() == num) {

                    System.out.println(repeatedWord.getKey());

                }

        }


        System.out.println(sortedMap);


    }
}




