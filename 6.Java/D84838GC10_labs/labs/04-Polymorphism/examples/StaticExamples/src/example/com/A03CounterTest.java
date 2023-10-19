package example.com;

public class A03CounterTest {

  public static void main(String[] args) {
      StaticCounter sc = new StaticCounter();
    System.out.println("Start: " + StaticCounter.getCount());
    StaticCounter.increment();
    StaticCounter.increment();
    sc.increment();
    System.out.println("End: " + StaticCounter.getCount());
  }
}
