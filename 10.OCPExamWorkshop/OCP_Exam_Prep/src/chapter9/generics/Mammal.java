package chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class Mammal {
    public List<CharSequence> play() {
        return new ArrayList<>();
    }

    public CharSequence sleep() {
        return "ggg";
    }

    class Monkey extends Mammal {
        public ArrayList<CharSequence> play() {
            return new ArrayList<>();
        }

    }

    class Goat extends Mammal {
        //        public List<String> play() {
//            return new ArrayList<>();
//        } // DOES NOT COMPILE
        public String sleep() {
            return "hhh";
        }
    }
}
