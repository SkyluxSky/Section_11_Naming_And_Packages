package com.skyluxsky;

//Decrypts the password - Compromises password class.
//Extended class has access to all of the methods in our password class.

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
