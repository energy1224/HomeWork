package com.iakovenko.javacore.lesson07;

public class Cat {
    private String name;
    private int weight;
    private int win;
    public Cat(int weight) {
        setWeight(weight);
        this.name= "Мурзик";
    }
    public int getWin() {
        return win;
    }
    public void setName(String name) {
        char[] arr = name.toCharArray();
        int countLetters = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ')
                countLetters++;
        }
        if (countLetters >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть меньше 3 символов");
        }
    }
    public void setWeight(int weight) {
        if (weight < 1 || weight >= 9) {
            throw new IllegalArgumentException("должно быть в диапазоне [1, 9)");
        }
        this.weight = weight;
    }

    public boolean attack(Cat cat){
        if (cat == null) {
            throw new IllegalArgumentException("cat not null");
        }
        if(this.weight>cat.weight) this.win++;
        else cat.win++;

        return this.weight>cat.weight;


    }

    public String getName() {
        return name;
    }
}
