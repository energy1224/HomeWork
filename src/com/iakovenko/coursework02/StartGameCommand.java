package com.iakovenko.coursework02;

public class StartGameCommand implements Command{

    private Game theGame;

    private String text = "Начать игру";

    public StartGameCommand(Game theGame) {
        this.theGame = theGame;
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
