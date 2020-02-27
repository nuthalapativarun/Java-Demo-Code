package com.example.myPackage;

public class AnotherClass {
    public String doSomething() {
        int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expressions class is " + getClass().getSimpleName());
            System.out.println("i in the lambda express = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };


        System.out.println("The AnotherClass calss's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }

    public void printValue() {
        int number = 25;
        Runnable r = () -> {
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}