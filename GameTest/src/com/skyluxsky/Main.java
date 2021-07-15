package com.skyluxsky;

//we can import our new self made package into our new project, once .jar file has been added to libraries section in
//file -> project structure.

//Imports our packages from self made package/library
import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player cam = new Player("Cam",10,15);
        System.out.println(cam.toString());
        saveObject(cam);

        cam.setHitPoints(8);
        System.out.println(cam);
        cam.setWeapon("Heavy Bow Gun");
        saveObject(cam);
        //loadObject(cam);
        System.out.println(cam);

        //werewolf utilizes code in our monster class
        ISaveable werewolf = new Monster("Werewolf",20,40);

        //To access internal methods of a class when using interfaces,
        //We must use type casting to access the classes inner methods.
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    //Simulates reading values from an outside file.
    //Allows for user to replace existing save by entering 1 or 0 to exit. (User must enter in all four values).
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    //ISaveable allows us to use any object that uses the interface
    public static void saveObject(ISaveable objectToSave){

        //Returns the list
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }

    }

    //Loads all objects in player class
    public static void loadObject(ISaveable objectsToLoad){
        ArrayList<String> values = readValues();
        objectsToLoad.read(values);
    }
}
