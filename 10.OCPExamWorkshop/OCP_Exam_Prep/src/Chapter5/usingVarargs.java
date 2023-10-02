package Chapter5;

public class usingVarargs {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        //walk1(data)
        walk1("Bianca" , 1,2,3);
    }

    public static void walk1(String name, int... steps) {
        System.out.println("first element is " + steps[0]);
        for (int step : steps) {
            System.out.println(step);
        }
        int[] array = steps;
        System.out.println("length of array is " + array.length);
    }
}
