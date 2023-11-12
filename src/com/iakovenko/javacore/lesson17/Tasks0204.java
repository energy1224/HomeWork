package com.iakovenko.javacore.lesson17;

import java.util.*;




public class Tasks0204  {

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
        Map<String, Long> repeatingStrings=new HashMap<>();
        String[] textWords = text.split(" ");
        long value;
        for (int i = 0; i < textWords.length; i++) {
            if (repeatingStrings.getOrDefault(textWords[i], -1L) == -1) {
                value = 1;
                repeatingStrings.put(textWords[i], value);
            } else {
                value = repeatingStrings.get(textWords[i]) + 1;
                repeatingStrings.put(textWords[i], value);
            }
        }

        List <Map.Entry<String, Long>> valuesList = new ArrayList(repeatingStrings.entrySet());

        // первый вариант
        valuesList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

       // второй вариант
//        Collections.sort(valuesList, new Comparator<Map.Entry< String, Long>>() {
//            @Override
//            public int compare(Map.Entry<String,Long> o1, Map.Entry< String, Long> o2) {
//                return (int) (o2.getValue()-o1.getValue());
//            }
//        });

        // третий вариант
//
//        ValueComparator <Map.Entry<String, Long>> comparator =new ValueComparator();
//
//        List <Map.Entry<String, Long>> list = new ArrayList<>(comparator);
//
//


        System.out.println("топ 10 самых часто встречаемых в тексте слов");
        for (int i = 0; i < 10; i++) System.out.println(valuesList.get(i));



    }

    public static class ValueComparator implements Comparator<Map.Entry<String, Long>>{

        @Override
        public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {

            return (int) (o2.getValue()-o1.getValue());
        }


    }




    }






