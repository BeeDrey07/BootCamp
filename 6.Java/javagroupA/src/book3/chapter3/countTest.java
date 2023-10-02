package book3.chapter3;

public class countTest {
    private static int instanceCount = 0;

    public countTest() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
