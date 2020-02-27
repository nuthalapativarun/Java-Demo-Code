package com.example.myPackage;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String , String > languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "a complied high level, oops language");
            System.out.println("Java added successfully");
        }

        languages.put("JavaScript", "a browser language");
        languages.put("Python", "a interpreted OOP language");
        System.out.println(languages.put("BASIC", "a begiiner language, easy to learn"));
        languages.put("Lisp", "a computer language");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "second inset for Java");
        }
        System.out.println("===========");
//        languages.remove("Lisp");
        if(languages.remove("Python", "a computer language")){
            System.out.println("Python removed");;
        }else{
            System.out.println("Python not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","This will not work", "new lisp language")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp not replaced");
        }
        System.out.println(languages.replace("Scala", "new Scala language"));

        for(String key: languages.keySet()){
            System.out.println(key + " -> " + languages.get(key));
        }
    }
}
