package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

//        Gearbox camry = new Gearbox(6);
//
//        camry.operateClutch(true);
//        camry.changeGear(1);
//        camry.operateClutch(false);
//        System.out.println(camry.wheelSpeed(1000));
//        camry.changeGear(2);
//        System.out.println(camry.wheelSpeed(3000));
//        camry.operateClutch(true);
//        camry.changeGear(3);
//        camry.operateClutch(false);
//        System.out.println(camry.wheelSpeed(6000));


    }

    private static void listen() {
        System.out.println("Please click 0 or 1 ");
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
