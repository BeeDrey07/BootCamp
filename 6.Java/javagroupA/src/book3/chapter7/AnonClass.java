package book3.chapter7;

public class AnonClass {
    public static void main(String[] args) {
        // Concrete
        Ball b1 = new Baseball();
        b1.hit();
        //Anonymous
        Ball b2 = new Ball() {
            @Override
            public void hit() {
                System.out.println("You hit an anonymous ball!");
            }
        };
        b2.hit();
        // lambda
        Ball b3 = () -> System.out.println("You hit a lambda ball");
        b3.hit();
    }

    ;
}

class Baseball implements Ball {
    @Override
    public void hit() {
        System.out.println("You hit it");
    }
}

interface Ball {
    void hit();
}

