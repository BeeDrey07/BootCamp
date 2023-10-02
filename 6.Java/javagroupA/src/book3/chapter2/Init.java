package book3.chapter2;

import java.util.Scanner;

public class Init {
    private Scanner sc = new Scanner(System.in);

    public int x;

    {
        System.out.print("Enter the starting calue for x: ");
        x = sc.nextInt();
        System.out.println("You entered " + x);
    }

    public Init() {
        System.out.println("In default constructor!!");
    }
}
