package com.example.myPackage;

public class Password {
    private static final int key = 786536723;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptDecrypt(encryptedPassword);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcom");
            return true;
        }else{
            System.out.println("Nope, u cant come in");
            return false;
        }
    }
}
