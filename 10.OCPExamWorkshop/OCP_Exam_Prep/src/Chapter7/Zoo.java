package Chapter7;

interface ZooRenovation {
    String projectName();

    String status();

    default void printStatus() {
        System.out.println("The " + projectName() + " project " + status() );
    }
}

public class Zoo implements ZooRenovation {
    @Override
    public String projectName() {
        return "Zoo.properties Test";
    }

    @Override
    public String status() {
        return "OPEN!";
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.printStatus();
    }
}
