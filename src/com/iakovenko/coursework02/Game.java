package com.iakovenko.coursework02;

import java.util.ArrayList;

public class Game {

   ArrayList<Paragraph> paragraphs;

    public Game(ArrayList<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public void startGame(){
        System.out.println(paragraphs.get(0));

    }
    public void backToGame(){
        System.out.println("Back to game");
    }
    public void escapeGame(){
        System.out.println("Escape game");
    }
    public void saveGame(){
        System.out.println("Save game");
    }
    public void downloadGame(){
        System.out.println("Download game");
    }




}
