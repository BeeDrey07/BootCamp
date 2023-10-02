package Chapter5;

public class ZooAnimalCheckUp {
    public static void main(String[] args) {
        final int rest;
        boolean isWeekend = false;
        if (isWeekend) {
            rest = 5;
        } else {
            rest = 20;
        }
        System.out.println(rest);
    }

    public String zooFriends() {
        final String name = "Sarah the Snake";
        var size = 10;
        final boolean wet;
        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }
}


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }

}
