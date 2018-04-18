package com.itschool;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double width = 10, length = 10;

        Room2D room2D = new Room2D(width, length);
        while (room2D.isError() == true) {
            System.out.println("Error values of width or length");
            System.out.printf("Input new values");
            // .....
            room2D.CheckCorrectness();
        }

        Room3D room3D = new Room3D(5,6,3);
        //System.out.println(room3D.isError());

        System.out.println(room3D.GetVolume());

        System.out.println(room3D instanceof Room2D);
    }
}
