/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)  {
        App myApp = new App();

        String inputString = myApp.getInput();

        myApp.printOutput(inputString);
    }

    public String getInput() {
        System.out.println("What is the input string? ");
        String name = in.nextLine();
        return name;
    }

    public void printOutput(String name) {
        System.out.println(name + " has " + name.length() + " characters.");
    }

}
