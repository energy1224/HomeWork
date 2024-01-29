package com.iakovenko.coursework02;

public class BackToGameCommand implements Command{

    private Game theGame;

    private String text= "Вернуться к игре";

    public BackToGameCommand(Game theGame) {
        this.theGame = theGame;
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
