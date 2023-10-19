//package chapter14;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InteractingWithUsers  {
    public static void main(String[] args) throws Exception {
//        System.out.println("Please enter something: ");
//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        String userInput = reader.readLine();
//        System.out.println("You entered: " + userInput);

//        try (var out = System.out) {}
//        System.out.println("Hello");
//
//        try (var out = System.out) {}
//        System.out.println("Hello");

//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        try (reader) {}
//        String data = reader.readLine(); // IOException

        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            String name = console.readLine("Please enter your name: ");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address? ");
            String address = console.readLine();
            char[] password = console.readPassword("Enter a password "
                    + "between %d and %d characters: ", 5, 10);
            char[] verify = console.readPassword("Enter the password again: ");
            console.printf("Passwords "
                    + (Arrays.equals(password, verify) ? "match" : "do not match"));
        }
    }
}
