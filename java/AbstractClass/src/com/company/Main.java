package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Gloden");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringnexk");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
