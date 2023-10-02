package book2.chapter6;

import java.util.Scanner;

public class SpaApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println
                ("The Spa application!\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        s = s.toLowerCase();
        char p = s.charAt(0);
        String details = "";
        switch (p) {
            case 'e':
                details += "\tSwedish Massage, plus ... \n";
            case 'd':
                details += "\tManicures and pedicures, plus ... \n";
            case 'c':
                details +=
                        "\tHot stone massage, plus ... \n";
            case 'b':
                details += "\tIndian head massage, plus ... \n";
            case 'a':
                details += "\tSeaweed wrap.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
