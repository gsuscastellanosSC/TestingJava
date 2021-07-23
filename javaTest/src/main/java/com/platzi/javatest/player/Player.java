package com.platzi.javatest.player;

public class Player {

    private Dice dice;
    private int minNumberToWint;

    public Player(Dice dice, int minNumberToWint) {
        this.dice = dice;
        this.minNumberToWint = minNumberToWint;
    }

    public boolean play(){
        int sayNumber = dice.roll();
        return sayNumber > minNumberToWint;
    }
}
