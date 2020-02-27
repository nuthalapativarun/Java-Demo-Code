package com.company;

public class EnhancedPlayer {
    private String name;
    private int hlth = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hlth, String weapon) {
        this.name = name;
        if(hlth > 0 && hlth <= 100){
            this.hlth = hlth;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        this.hlth -= damage;
        if(this.hlth <= 0){
            System.out.println("Player is dead");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hlth;
    }
}
