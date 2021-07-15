package com.skyluxsky;

//import javafx.scene.Node;
//import org.w3c.dom.Node; //Error we cannot have two imports of the same name.

public class Main {

    public static void main(String[] args) {

        //Java recommends names of packages that you may want
        //A package is a method of grouping java classes and interfaces together...

        //javafx.scene.Node node = null;

        javafx.scene.Node node = null; //Referenced from import...
        org.w3c.dom.Node nodeDifferentPackage = null;


            //Some reasons to use packages are:
            //-Programmers can easily determine that the classes are related.

            //-It is easy to know where to find the classes and interfaces that can provide the functions
            // provided by the package.

            //-Because the package creates a new namespace, class and interface name conflicts are avoided.

            //Classes within the package can have unrestricted access to one another while
            //still restricting access for classes outside the package.

            //java.lang is created automatically when we create a java program.

    }
}
