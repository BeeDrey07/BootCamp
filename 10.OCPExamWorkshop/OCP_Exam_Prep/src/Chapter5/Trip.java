package Chapter5;

public class Trip {
    public static void main(String[] args) {
        Trip trip = new Trip();
//        trip.visitZoo("Bianca", "Hippopotamus");
        trip.visitZoo(30, "easter hunt");
    }

    public void visitZoo(String name, int waitTime) {
        System.out.println(name + " is waiting for " + waitTime + " minutes.");
    }

    public void visitZoo(int rainFall, String attraction) {
        System.out.println("The attraction for today is the " + attraction + " depending on the rainfall of  : " + rainFall);
    }

    public void visitZoo(String name, String animal) {
        System.out.println(name + " wants to see the " + animal);
    }
}
