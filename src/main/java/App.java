/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Num1 = myApp.readCurrentAge();
        String Num2 = myApp.readRetireAge();
        int int1 = Integer.parseInt(Num1);
        int int2 = Integer.parseInt(Num2);
        int areaFeet = myApp.areaFeet(int1, int2);
        double conversion = 0.09290304;
        double areaMeter = myApp.areaMeter(int1, int2, conversion);
        String outputString = myApp.generateOutputString(int1, int2, areaFeet, areaMeter);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readCurrentAge(){
        System.out.print("What is the length of the room in feet? ");
        return in.nextLine();
    }

    public String readRetireAge(){
        System.out.print("What is the width of the room in feet? ");
        return in.nextLine();
    }

    public int areaFeet(int int1, int int2){
        return int1 * int2;
    }

    public double areaMeter(int int1, int int2, double conversion){
        return ((int1 * int2) * conversion);
    }

    public String generateOutputString(int int1, int int2, int areaFeet, double areaMeter){
        return String.format("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters", int1, int2, areaFeet, areaMeter);
    }
}