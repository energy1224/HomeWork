package com.iakovenko.coursework02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Start {
    public static void main(String[] args) {

        File file = new File("paragraphs.txt");
        ArrayList<String> strings = readFile(file);
        ArrayList<Paragraph> paragraphsList = setParagrafList(strings);



        Game game01 = new Game(paragraphsList);
        Command startGame = new StartGameCommand(game01);
        Command saveGame = new SaveGameCommand(game01);
        Command escapeGame = new EscapeGameCommand(game01);
        Command downloadGame = new DownloadGameCommand(game01);
        Command backToGame = new BackToGameCommand(game01);
        Menu menu = new Menu(startGame, saveGame, escapeGame, downloadGame, backToGame);
        System.out.println(menu);
        int reply;
        Scanner scan = new Scanner(System.in);
        reply = scan.nextInt();
        if (reply == 1) {
            menu.start();
        } else if (reply == 2) {
            menu.back();
        } else if (reply == 3) {
            menu.escape();
        } else if (reply == 4) {
            menu.download();
        } else if (reply == 5) {
            menu.save();
        } else {
            System.out.println("Choose right point ");
        }
        Scanner scan1 = new Scanner(System.in);
        reply = scan.nextInt();



    }

    public static ArrayList<String> readFile(File file) {
        ArrayList<String> strings = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                strings.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return strings;
    }

    public static ArrayList<Paragraph> setParagrafList(ArrayList<String> strings) {
        ArrayList<Paragraph> paragraphArrayList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals("=")) {
                Paragraph paragraph = new Paragraph();
                paragraph.setTitle(strings.get(i + 1));
                paragraph.setText(strings.get(i + 2));
                paragraph.setAnswer1(strings.get(i + 3));
                paragraph.setAnswer2(strings.get(i + 4));
                paragraphArrayList.add(paragraph);
            }
        }
        return paragraphArrayList;
    }
}
