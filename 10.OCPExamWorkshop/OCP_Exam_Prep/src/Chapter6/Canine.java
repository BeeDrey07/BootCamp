package Chapter6;

public abstract class Canine {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }

    class Wolf extends Canine {
        public String getSound() {
            return "Wooooooof!";
        }
    }

    class Fox extends Canine {
        public String getSound() {
            return "Squeak!";
        }
    }

    class Coyote extends Canine {
        public String getSound() {
            return "Roar!";
        }
    }
}
