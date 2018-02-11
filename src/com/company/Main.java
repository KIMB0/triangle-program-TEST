package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        while (true) {
            System.out.println("Enter the length of side A");
            Scanner scan = new Scanner(System.in);
            triangle.setSideA(scan.nextInt());

            System.out.println("Enter the length of side B");
            triangle.setSideB(scan.nextInt());

            System.out.println("Enter the length of side C");
            triangle.setSideC(scan.nextInt());

            System.out.println(triangle.giveTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
            System.out.println("Restarting...");
            System.out.println("...");
        }
    }
}
