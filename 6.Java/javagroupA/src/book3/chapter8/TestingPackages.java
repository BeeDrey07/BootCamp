package book3.chapter8;

import com.gmail.beedrey07.Console;

public class TestingPackages {
    public static void main(String[] args) {
        while (Console.askYorN("Keep going?"))
        {
            System.out.println("D'oh!");
        }
    }
}
