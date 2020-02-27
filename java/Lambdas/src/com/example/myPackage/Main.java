package com.example.myPackage;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Bolt", 21);
        Employee jack = new Employee("Jack Borrow", 40);
        Employee snow = new Employee("Bagel Snow", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        for(Employee employee: employees){
////            System.out.println(employee.getName());
////            System.out.println(employee.getAge());
//////            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
//        System.out.println("**********************");
//
//        for(int i=0; i<employees.size(); i++){
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }

////        Collections.sort(employees, new Comparator<Employee>() {
////            @Override
////            public int compare(Employee emp1, Employee emp2) {
////                return emp1.getName().compareTo(emp2.getName());
////            }
////        });
//
//        Collections.sort(employees, (emp1, emp2) ->
//                emp1.getName().compareTo(emp2.getName()));
//
//        for(Employee employee: employees) {
//            System.out.println(employee.getName());
//        }
//
////        String str = doStringStuff(new UpperConcat() {
////            @Override
////            public String upperAndConcat(String s1, String s2) {
////                return s1.toUpperCase() + s2.toUpperCase();
////            }
////        },
////                employees.get(0).getName(), employees.get(1).getName());
////
////        System.out.println(str);
//
//        UpperConcat uc = (s1, s2) -> {
//            String result = s1.toUpperCase() + s2.toUpperCase();
//            return result;
//        };
//        String str = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(str);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}


