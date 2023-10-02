package book2.chapter5;

import java.util.Scanner;

public class GetABet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 5000;
        int bet;
        System.out.println("You can bet between 1 and " + bank);

        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            if( bet <= 0 || bet > bank) {
                System.out.println("Invalid Bet!");
            }
        } while ((bet <= 0) || (bet > bank));
        System.out.println("Your money is Good here.");
    }
}
