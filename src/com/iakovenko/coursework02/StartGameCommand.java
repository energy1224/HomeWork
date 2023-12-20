package com.iakovenko.coursework02;

public class StartGameCommand implements Command{

    private Game theGame;

    private String text = "Start game";

    public StartGameCommand(Game theGame) {
        this.theGame = theGame;
        this.text = text;
    }

    @Override
    public String toString() {
        return  text;
    }

    @Override
    public void execute() {
        theGame.startGame();

    }
}
