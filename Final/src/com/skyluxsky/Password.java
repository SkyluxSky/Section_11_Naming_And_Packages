package com.skyluxsky;

//Example of basic XOR - returns original password and compares it to encrypted password

public final class Password {
    private static final int key = 748576362;
    private final int encryptedPassword;

    //Constructor
    public Password(int password) {
        this.encryptedPassword = encryptedDecrypt(password);
    }

    //Methods
    private int encryptedDecrypt(int password){
        return password ^ key;//Encrypts password with key
    }

    public void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    //Checks password
    public boolean letMeIn(int password){
        if (encryptedDecrypt(password)  == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }

    }
}
