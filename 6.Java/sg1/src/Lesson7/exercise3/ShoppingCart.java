package Lesson7.exercise3;

public class ShoppingCart {
    public static void main(String[] args){
        int int1;

        //  Declare and initialize variables of type long, float, and char.
        long myLong = 75_240_000_000L;
        float myFloat = 54.7F;
        char myChar = 'B';

        // Print the long variable.
        System.out.println("Long Variable: " + myLong);

        // Assign the long to the int and print the int variable.
        int1 = (int) myLong;
        System.out.println("Long assigned to int variable: " + int1);

    }
}

