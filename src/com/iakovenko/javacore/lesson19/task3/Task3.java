package com.iakovenko.javacore.lesson19.task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task3 {

    public static void main(String[] args) {
        Author author01 = new Author("Jack", "author@mail.ru", LocalDate.of(1981, Month.MAY, 21));
        Author author02 = new Author("Roy", "sofia@mail.ru", LocalDate.of(1980, Month.MAY, 21));//43
        Author author03 = new Author("Maya", "piter@mail.ru", LocalDate.of(1980, Month.MAY, 21));
        Author author04 = new Author("Scoth", "piter@mail.ru", LocalDate.of(2005, Month.MAY, 21));//18

        Author[] authors01 = new Author[]{author01, author02, author03};
        Author[] authors02 = new Author[]{author01, author02};
        Author[] authors03 = new Author[]{author02, author03};
        Author[] authors04 = new Author[]{author02, author04};

        Article article04 =new Article("Bread", Article.Category.FOOD,authors04);
        Article article01 = new Article("winter", Article.Category.FOOD, authors01);
        Article article02 = new Article("summer", Article.Category.FOOD, authors02);
        Article article03 = new Article("China", Article.Category.FOOD, authors03);
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(article01);
        articles.add(article02);
        articles.add(article03);
        articles.add(article04);

//        System.out.println(task01(articles));
//        System.out.println(task02(articles, Article.Category.FOOD));

     //   System.out.println(task03(articles, Article.Category.FOOD,20,44));
        System.out.println(task04(articles, Article.Category.FOOD));

        // Написать реализацию методов task01 - task04
        // Перед выполнением посмотрите методы flatMap / flatMapToInt / map / mapToInt / allMatch / anyMatch / noneMatch
        // Некоторые из этих методов могут понадобиться при решении задач
    }
    public static Double task01(ArrayList<Article> articles) {
        LocalDate nowDate = LocalDate.now();
        // Вернуть средний возраст авторов статей
        double averageAge = articles.stream()
                .map(article -> article.getAuthors())
                .flatMap(authorHashMap -> authorHashMap.values().stream())
                .map(author -> author.getBirth().getYear())
                .mapToInt(age -> nowDate.getYear() - age)
                .average().orElse(0);
        return averageAge;
    }
    public static List<String> task02(ArrayList<Article> articles, Article.Category category) {
        // Вернуть список email авторов статей категории == category
        List<String> authorsByCategory= articles.stream()
                .filter(byCategory-> byCategory.getCategory()==category)
                .map(article -> article.getAuthors())
                .flatMap(authorHashMap -> authorHashMap.values().stream())
                .map(email->email.getEmail())
                .toList();
        return authorsByCategory;
    }
    public static List<Article> task03(ArrayList<Article> articles, Article.Category category, int min, int max) {
        LocalDate nowDate = LocalDate.now();
        // Вернуть список статей категории == category,
        // возраст авторов которых попадает в диапазон от min до max
       List<Article> articlesByCategory=articles.stream()
               .filter(byCategory-> byCategory.getCategory()==category)
               .filter(article->(article.getAuthors().values().stream()
                        .allMatch(s->(nowDate.getYear()-s.getBirth().getYear())>min
                                && (nowDate.getYear()-s.getBirth().getYear())<max)))
               .toList();

        return articlesByCategory;
    }
    public static List<Article> task04(ArrayList<Article> articles, Article.Category category) {
        // Вернуть список статей категории == category, опубликованных сегодня
        LocalDateTime nowDate = LocalDateTime.now();
        List<Article> todayPublished =articles.stream()
                .filter(byCategory-> byCategory.getCategory()==category)
                .filter(article -> article.getPublished().getDayOfMonth()==nowDate.getDayOfMonth())
                .toList();
        return todayPublished;
    }


}
