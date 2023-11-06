package com.iakovenko.javacore.lesson1516.TestMyLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {



         MyLinkedList<User> userList =new MyLinkedList<>();

        User user01 = new User("male", "Jon", true);
        User user02 = new User("female", "Rita", true);
        User user03 = new User("male", "Bob", false);
        User user04 = new User("female", "Liza", true);
        User user05 = new User("male", "Tim", false);


       userList.add(user01);
      System.out.println(userList);
        System.out.println();
       userList.add(user02);
       System.out.println(userList);
        System.out.println();
        userList.add(user03);
        System.out.println(userList);
        System.out.println();
        userList.add(user04);
        System.out.println(userList);

        System.out.println();
        userList.add(user05);
        System.out.println(userList);

     //  userList.printMyLinkedList();











    }
}
