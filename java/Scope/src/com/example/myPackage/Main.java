package com.example.myPackage;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        System.out.println("scopeCheck var1 is " + scopeCheck.getVar1());
        System.out.println(var4);

        scopeCheck.timesTwo();

        System.out.println("******");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();
    }
}
