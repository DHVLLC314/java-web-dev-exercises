package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double pi = 3.14;
        double radius;
        double area;

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of " + radius + " is: " + area);

    }
}
