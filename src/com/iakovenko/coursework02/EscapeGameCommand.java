package com.iakovenko.coursework02;

public class EscapeGameCommand implements Command{

    private Game theGame;

    private String text = "Escape game";

    public EscapeGameCommand(Game theGame) {
        this.theGame = theGame;
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void execute() {
        theGame.escapeGame();

    }
}
