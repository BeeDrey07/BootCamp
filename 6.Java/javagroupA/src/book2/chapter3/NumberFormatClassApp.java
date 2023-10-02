package book2.chapter3;

import java.text.NumberFormat;

public class NumberFormatClassApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    static void printMyAllowance() {
        double myAllowance = 1050;
        System.out.println("My allowance : " + cf.format(myAllowance));
    }

    static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 100.99;
        System.out.println("Cost of gun: " + cf.format(costOfPaintBallGun));
    }
}
