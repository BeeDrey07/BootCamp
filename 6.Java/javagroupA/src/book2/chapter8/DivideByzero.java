package book2.chapter8;
public class DivideByzero {
    public static void main(String[] args){
        try {
            int a = 10, b = 0;
            int c = a/b;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }
    }
}
