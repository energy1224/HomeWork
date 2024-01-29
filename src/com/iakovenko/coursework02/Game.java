package com.iakovenko.coursework02;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
   ArrayList<Paragraph> paragraphs;
   private int startingPoint;
    public Game(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
        this.startingPoint = 0;
    }
    public int getStartingPoint() {
        return startingPoint;
    }
    public void startGame(){
        startingPoint=0;
        backToGame();
    }
    public void backToGame(){
        System.out.println(paragraphs.get(startingPoint));
        while (true) {
            Scanner scan = new Scanner(System.in);
            int reply = scan.nextInt();
            if(paragraphs.get(startingPoint).getAnswer1()!=null) {
                if (reply == 1) {
                    System.out.println(paragraphs.get(startingPoint).getAnswer1());
                    startingPoint = paragraphs.indexOf(paragraphs.get(startingPoint).getAnswer1());
                } else if (reply == 2) {
                    System.out.println(paragraphs.get(startingPoint).getAnswer2());
                    startingPoint = paragraphs.indexOf(paragraphs.get(startingPoint).getAnswer2());
                } else if (reply == 3) {
                    startingPoint = paragraphs.indexOf(paragraphs.get(startingPoint));
                    break;
                } else {
                    System.out.println("Введите цифру от 1 до 3");
                }
            }else {
                if (reply == 1) {
                    startingPoint = paragraphs.indexOf(paragraphs.get(startingPoint));
                    break;
                } else {
                    System.out.println("Введите цифру 1");
                }
            }
        }
    }
    public void escapeGame(){
       startingPoint=-1;
    }
    public void saveGame(){
        File file= new File("savedGame.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(startingPoint);
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        System.out.println("Игра сохранена");
    }
    public void downloadGame(){
        File file=new File("savedGame.txt");
        try {
           Scanner scanner = new Scanner(file);
            startingPoint= scanner.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        backToGame();
    }
}
