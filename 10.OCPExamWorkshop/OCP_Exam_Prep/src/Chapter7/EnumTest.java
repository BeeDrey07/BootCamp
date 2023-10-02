package Chapter7;

public class EnumTest {
    //    public static void main(String[] args) {
//         enum Season{WINTER, SPRING, SUMMER, AUTUMN}
//         var s = Season.SUMMER;
//        System.out.println(s);
//        System.out.println(Season.AUTUMN);
//        System.out.println(s == Season.SUMMER);
//        for(var season: Season.values()) {
//            System.out.println(season.name() + " " + season.ordinal());
//        }
    enum Season implements Weather {
        WINTER("Low"){
            @Override
            public String getHours() {
                return "10am-3pm";
            }

            @Override
            public int getAverageTemperature() { return 7; }

        }, SPRING("Medium") {
            @Override
            public String getHours() {
                return "9am-7pm";
            }
            @Override
            public int getAverageTemperature() { return 22; }
        }, SUMMER("High") {
            @Override
            public String getHours() {
                return "9am-5pm";
            }
            @Override
            public int getAverageTemperature() { return 30; }
        }, FALL("Medium") {
            @Override
            public String getHours() {
                return "9am-5pm";
            }
            @Override
            public int getAverageTemperature() { return 15; }
        };

        public abstract String getHours();

        private final String expectedVisitors;

        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

    public static void main(String[] args) {
        Season.WINTER.printExpectedVisitors();
        System.out.println(Season.SUMMER.getHours());
        System.out.println(Season.FALL.getAverageTemperature());
    }
    public interface Weather { int getAverageTemperature(); }
}


