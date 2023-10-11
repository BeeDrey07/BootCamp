package chapter11;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
//        fall(11);
        fall(null);
    }

    static void fall(int distance)  {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println(e);
//            e.printStackTrace();
        }
    }

    static void fall (String input) {
        System.out.println(input.toLowerCase());
    }
}
