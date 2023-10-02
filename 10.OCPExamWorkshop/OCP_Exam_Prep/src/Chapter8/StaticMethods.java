package Chapter8;

public class StaticMethods {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        System.out.println("rounding off to " + methodRef.round(4.099999F));
    }
}

interface Converter {
    long round(double d);
}
