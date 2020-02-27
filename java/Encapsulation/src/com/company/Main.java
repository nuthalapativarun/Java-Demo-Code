package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Varun";
//        player.health = 20;
//        player.weapon = "Gun";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());
//
//        damage = 11;
//        player.looseHealth(damage);
//        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("varun", 50, "Gun");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
