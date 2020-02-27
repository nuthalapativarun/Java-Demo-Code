package com.example.myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

//        System.out.println(lambdaFunction.apply("1234567890"));
        String result = everySecondCharacter(lambdaFunction, "1234567890");
        System.out.println(result);

//        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava = () -> { return "I love Java!"; };

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames = Arrays.asList("John", "Tom", "Tony", "Gina", "Amy", "Annie");

        topNames
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        long namesBegginingWithA = topNames
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Number of names begingin with A is: " + namesBegginingWithA);


    }

    public static String everySecondCharacter(Function<String, String> func, String source){
        return func.apply(source);
    }
}
