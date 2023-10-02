package Chapter7;

public class TestRecord {
    public static void main(String[] args) {
        var mommy = new Crane(4, "biaNCa");
        var child = new Crane(4, "Crammy");
        System.out.println(mommy);
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());
        System.out.println(mommy.equals(child));
        System.out.println(mommy == child);
    }
}

record Crane(int numberEggs, String name) {

    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();
//        name = name.toUpperCase();
        if(name == null || name.length() < 1)
        throw new IllegalArgumentException();
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}

