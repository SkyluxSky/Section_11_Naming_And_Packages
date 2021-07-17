package com.skyluxsky;
/**Class Level**/
//Only classes, interfaces, and enums can exist at the top level,
//everything else must be included within one of these.

//Public: the object is visible to all classes everywhere, whether they are in the
//same package or have imported the package containing the public class.

//Package-private: the object is only available within its own package (and visible to every class
// within the same package). Package private is specified by not specifying, i.e.
// It is the default if you do not specify. There is not a "package-private" keyword.


/**Member Level**/
//Public: at the member level, public has the same meaning as at the top level
//A public class member (or field) and public method can be accessed from any other class
//anywhere, even in a different package.

/*
*Package-private: This also has the same meaning as it does at the top level.
* An object with no access modifier is visible to every class within the same package
* (but not to classes in external packages)
*
*Private: the object is only visible within the class it is declared. It is not visible
* anywhere else (including the subclasses of its class).
*
*
*
* */

public class Main {

    public static void main(String[] args) {
        Account camsAccount = new Account("Cam");
        camsAccount.deposit(1000);
        camsAccount.withdraw(500);
        camsAccount.withdraw(-200);
        camsAccount.deposit(-20);
        camsAccount.calculateBalance();

        System.out.println("Balance on account is " + camsAccount.getBalance());

        //ERROR - When field are public we can change them outside of the class.
//        camsAccount.balance = 900500;
//        System.out.println("Balance on account is " + camsAccount.getBalance());
//        camsAccount.transactions.add(900000);
//        camsAccount.calculateBalance();
    }
}
