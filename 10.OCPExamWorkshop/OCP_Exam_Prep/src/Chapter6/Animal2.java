package Chapter6;

public class Animal2 {
    private int age;
    private String name;

    public Animal2(int age, String name) {
        super();
        this.setAge(age);
        this.setName(name);
    }

    public Animal2(int age) {
        this(age, null);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        var g1 = new Gorilla();
        var g2 = new Gorilla(10);
        System.out.println(g1);
        System.out.println(g2);
        var z1 = new Zebra();
        var z2 = new Zebra();
        System.out.println(z1);
        System.out.println(z2);
    }
}
