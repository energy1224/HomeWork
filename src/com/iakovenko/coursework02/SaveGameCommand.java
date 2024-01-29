package com.iakovenko.coursework02;

public class SaveGameCommand implements Command{

    private Game theGame;

    private String text ="Сохранить игру";

    public SaveGameCommand(Game theGame) {
        this.theGame = theGame;

    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void execute() {
        theGame.saveGame();

    }
}
