package Chapter3;

public class Chapter3 {
    public static void main(String[] args) {
        Integer number = 7;
//        compareIntegers(number);
        printIntegerTwice(number);
    }

    private static void compareIntegers(Number number) {
        if (number instanceof final Integer data && data.compareTo(5) > 0) {
            System.out.println("Number is greater than 5  : " + data);
        }
    }

    static void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof final Integer data || data.compareTo(5) > 0)
//            System.out.println(data);
    }

    static void printIntegerTwice(Number number) {
        if(!(number instanceof  Integer data)) {
            System.out.println("Not an instance of Integer");
            return;
        } else {
            System.out.println(data.intValue());
        }
//        System.out.println(data.intValue()); // DOES NOT COMPILE
    }
}
