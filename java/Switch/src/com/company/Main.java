package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = 4;

        switch (value){
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:case 4: case 5:
                System.out.println("3 or 4 or 5");
                break;
            default:
                System.out.println("Not 1 or 2");
        }

//        String numberAsString = "2020.89";
//        System.out.println("number as String " + numberAsString);
//
//        double number = Double.parseDouble(numberAsString) + 2;
//        System.out.println("number " + number);

        Scanner scanner = new Scanner(System.in);

//
//        System.out.println("Enter your birth year");
//        int yearOfBirth = scanner.nextInt();
//        int age = 2020 - yearOfBirth;
//        System.out.println("You are " + age + " old");
//        scanner.nextLine();
//
//
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hi " + name);
//
//        System.out.println(Math.round(3.667));

//        int sum = 0;
//        int counter = 0;
//
//        while(true){
//            boolean isInt = scanner.hasNextInt();
//            if(isInt){
//                int number = scanner.nextInt();
//                sum += number;
//                counter++;
//            }else{
//                double avg = (double)(sum)/counter;
//                System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
//                break;
//            }
//        }
//
//
//        scanner.close();

        double width = 3.4;
        double height = 2.1;
        double areaPerBucket = 1.5;
        double extraBuckets = 2;

        double totalArea = width * height;
        System.out.println("total area" + totalArea);
        double leftArea = totalArea - extraBuckets * areaPerBucket;
        System.out.println("leftArea" + leftArea);

        double buckets = (double) leftArea/areaPerBucket;

        System.out.println(Math.round(buckets));
    }
}
