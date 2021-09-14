/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the width of the room in feet?");
        int width = in.nextInt();

        System.out.println("What is the length of the room in feet?");
        int length = in.nextInt();

        System.out.println("You entered the dimensions of " + width + " feet by " + length + " feet");

        int area = width * length;
        final double conversion = area * 0.09290304;

        System.out.println("The area is:" + "\r\n" +
                            area + " square feet" + "\r\n" +
                            conversion + " square meters");
    }
}
