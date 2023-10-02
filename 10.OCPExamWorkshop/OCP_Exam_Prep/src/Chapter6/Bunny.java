package Chapter6;

public class Bunny {

    public String name;
    public Bunny() {
        System.out.print("HOP!");
        this.name = "Doe";
    }

    public Bunny(String name) {
        this.name = name;
        System.out.println("HOP!");
    }

    public static void main(String[] args) {
        var bunny = new Bunny();
        var bunny2 = new Bunny();
        var bunny3 = new Bunny();
        System.out.println(bunny);
        System.out.println(bunny2);
        System.out.println(bunny3);

    }
}