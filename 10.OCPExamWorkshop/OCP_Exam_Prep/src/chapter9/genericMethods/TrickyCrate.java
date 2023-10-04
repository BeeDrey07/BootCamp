package chapter9.genericMethods;

public class TrickyCrate<T> {
    public  <T>  T tricky(T t) {
        return t;
    }

    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("ddd");
    }

    public static void main(String[] args) {
        System.out.println(crateName());
    }
}

class Robot {

}