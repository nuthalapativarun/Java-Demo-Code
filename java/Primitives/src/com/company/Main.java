package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);
        System.out.println("Buster MAX value = " + (myMaxIntValue + 1));
        System.out.println("Buster MIN value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + myMinByteValue);
        System.out.println("Byte Max Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + myMinShortValue);
        System.out.println("Short Max Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + myMinLongValue);
        System.out.println("Long Max Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647984L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);


        //Challenge
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10L * (byteValue + shortValue + intValue);
        System.out.println("Long Total = " + longTotal);

        short shortTotal = (short)(100 + 10 *
                (byteValue + shortValue + intValue));

        //Float and Double
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge convert KGS to Pounds
        double numberOfPounds = 200;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kgs = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        //Char and Boolean
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOver21 = true;

        //String
        String myString = "This is a string";
        System.out.println("my string = " + myString);
        myString = myString + " , this is more";
        System.out.println("my string = " + myString);
        myString = myString + " , \u00A9 2019";
        System.out.println("my string = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = myInt + lastString;
        System.out.println("Last string = " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string = " + lastString);

        //Operators
        int result = 1 + 2; // = 3
        System.out.println(result);

        // if statement
        boolean isAlien = false;
        if(!isAlien){
            System.out.println("Not an Alien");
        }

    }
}
