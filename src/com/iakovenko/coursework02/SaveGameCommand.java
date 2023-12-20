package com.iakovenko.coursework02;

public class SaveGameCommand implements Command{

    private Game theGame;

    private String text ="Save game";

    public SaveGameCommand(Game theGame) {
        this.theGame = theGame;
        this.text = text;
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
