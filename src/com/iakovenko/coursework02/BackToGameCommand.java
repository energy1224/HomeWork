package com.iakovenko.coursework02;

public class BackToGameCommand implements Command{

    private Game theGame;

    private String text= "Back to game";

    public BackToGameCommand(Game theGame) {
        this.theGame = theGame;
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void execute() {
        theGame.backToGame();

    }
}
