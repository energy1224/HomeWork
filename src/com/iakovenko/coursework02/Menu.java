package com.iakovenko.coursework02;

public class Menu {

    private Command startCommand;
    private Command downloadCommand;

    private Command escapeCommand;

    private Command saveCommand;

    private Command backCommand;

    public Menu(Command startCommand, Command downloadCommand, Command escapeCommand, Command saveCommand, Command backCommand) {
        this.startCommand = startCommand;
        this.downloadCommand = downloadCommand;
        this.escapeCommand = escapeCommand;
        this.saveCommand = saveCommand;
        this.backCommand = backCommand;
    }

    @Override
    public String toString() {
        return "Menu \n" +
                "1 " + startCommand.toString()+"\n"+
                "2 " + backCommand.toString()+"\n"+
                "3 " + escapeCommand.toString()+"\n"+
                "4 "+ saveCommand.toString()+"\n"+
                "5 "+ downloadCommand.toString();
    }



    public void start(){
        startCommand.execute();
    }
    public void download(){
        downloadCommand.execute();
    }

    public void escape(){
        escapeCommand.execute();
    }

    public void save(){
        saveCommand.execute();
    }
    public void back(){
        backCommand.execute();
    }
}
