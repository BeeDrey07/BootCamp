package book2.chapter3;

import java.util.Scanner;

public class CircleAreaApp {
    static Scanner sc = new Scanner((System.in));
    public static void main(String[] args) {
        System.out.println("Welcome to the circle area calculator.");
        System.out.println("Enter a radius of a circle:");
        double r =sc.nextDouble();
        double area = Math.PI * (r*r);
        System.out.println("The area is: " + area + " units².");
    }

}
