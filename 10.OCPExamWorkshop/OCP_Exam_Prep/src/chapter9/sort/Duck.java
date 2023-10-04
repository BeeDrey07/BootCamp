package chapter9.sort;

public class Duck implements Comparable<Duck>{
    private String name;
    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck o) {
        return 0;
    }
}
