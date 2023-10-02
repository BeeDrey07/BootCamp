package Chapter5.pond.goose;

import Chapter5.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim(); // allowed

        System.out.print("\nThanks" + " " + teacher.name + "!"); // allowed
    }
}
