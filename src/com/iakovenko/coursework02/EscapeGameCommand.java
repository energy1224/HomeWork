package com.iakovenko.coursework02;

public class EscapeGameCommand implements Command{

    private Game theGame;

    private String text = "Выйти из игры";

    public EscapeGameCommand(Game theGame) {
        this.theGame = theGame;
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
