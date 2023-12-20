package com.iakovenko.coursework02;

public class DownloadGameCommand implements Command{

    private Game theGame;

    private String text ="Download game";

    public DownloadGameCommand(Game theGame) {
        this.theGame = theGame;
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void execute() {
        theGame.downloadGame();

    }
}
