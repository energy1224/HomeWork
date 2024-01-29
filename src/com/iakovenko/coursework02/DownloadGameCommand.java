package com.iakovenko.coursework02;

public class DownloadGameCommand implements Command{

    private Game theGame;

    private String text ="Загрузить игру";

    public DownloadGameCommand(Game theGame) {
        this.theGame = theGame;
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
