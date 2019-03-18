package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double width = 0, length = 0;
        Scanner scanner = new Scanner(System.in);

        Room2D room2D = new Room2D(width, length);
        while (room2D.isError() == true) {
            System.out.println("Error values of width or length");
            System.out.printf("Input new width");
            width = Double.parseDouble(scanner.nextLine());
            System.out.printf("Input new length");
            length = Double.parseDouble(scanner.nextLine());
            room2D.setLength(length);
            room2D.setWidth(width);
            room2D.CheckCorrectness();
        }
        System.out.println(room2D.GetArea());

        Room3D room3D = new Room3D(5,6,3);
        //System.out.println(room3D.isError());

        System.out.println(room3D.GetVolume());
Room3D newRoom3D = new Room3D(10);
        //System.out.println(room3D instanceof Room2D);
    }
}
