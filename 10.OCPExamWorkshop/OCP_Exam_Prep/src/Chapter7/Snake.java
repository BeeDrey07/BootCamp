package Chapter7;

public class Snake implements isColdBlooded {
    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTemperature() {
        return 12;
    }

    public static void main(String[] args) {
        Snake s = new Snake();
        System.out.println(s.getTemperature());
    }
}

interface isColdBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}

