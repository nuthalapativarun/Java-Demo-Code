package com.company;

public class Main {

    public static void main(String[] args) {
        calculate(true, 5000);

    }

    public static void calculate(boolean gameOver, int score){
        if(gameOver){
            System.out.println("score is = " + score);
        }
    }
}
