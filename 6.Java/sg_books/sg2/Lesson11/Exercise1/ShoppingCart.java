package Lesson11.Exercise1;

// import statements here:


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
    public static void main(String[] args) {
        // Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;

        // Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println("Order date: " + orderDate);

        // Format orderDate using ISO_LOCAL_DATE; Print it.
        System.out.println("Formatted order date: " + orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

    }
}
