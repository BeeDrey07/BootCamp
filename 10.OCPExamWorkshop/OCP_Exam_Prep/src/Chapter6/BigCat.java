package Chapter6;

public class BigCat {
    protected double size;
}

class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.println(size);
    }
}

class Spider {
    public void printDetails() {
//        System.out.println(size); // no access to size, not a child class
    }
}