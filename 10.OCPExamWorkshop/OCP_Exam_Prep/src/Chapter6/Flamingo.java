package Chapter6;

public class Flamingo {
//    private String color = null;
    public String color;

    public void setColor(String color) {
        color = color;
    }

    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}
