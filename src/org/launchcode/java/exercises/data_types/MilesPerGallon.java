package org.launchcode.java.exercises.data_types;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven today?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you consumed today?");
        double gasConsumed = input.nextDouble();
        input.close();
        double milesPerGallon = miles / gasConsumed;
        System.out.println("Your miles per gallon used today was:  " + milesPerGallon);

    }
}
