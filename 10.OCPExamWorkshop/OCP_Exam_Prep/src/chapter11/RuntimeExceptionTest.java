package chapter11;

public class RuntimeExceptionTest {
    int numberOfEggs;

    public static void main(String[] args) {
//        int answer = 11/0;
//        int[] countOfMoose = new int[3];
//        System.out.println(countOfMoose[-1]);
//        String type = "moose";
//        Integer number = (Integer) type;
//        Frog.hop(null, 8);
        RuntimeExceptionTest ex = new RuntimeExceptionTest();
        ex.setNumberEggs(-1);
    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException("# eggs must not be negative");
        }
        this.numberOfEggs = numberEggs;
    }
}

class Frog {
    static public void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }
}
