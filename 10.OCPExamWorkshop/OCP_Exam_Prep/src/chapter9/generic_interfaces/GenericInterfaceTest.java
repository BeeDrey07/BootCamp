package chapter9.generic_interfaces;

import java.awt.*;

public class GenericInterfaceTest {
    public static void main(String[] args) {
        Shippable sac = new ShippableAbstractCrate();
        Shippable rac = new ShippableAbstractCrate();
    }
}

interface Shippable<T> {
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {
    }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(Object t) {
    }
}

class ShippableCrate implements Shippable {

    public void ship(Object t) {
    }
}
