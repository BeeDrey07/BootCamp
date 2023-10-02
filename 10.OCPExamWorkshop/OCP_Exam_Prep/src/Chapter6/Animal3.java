package Chapter6;

public abstract class Animal3 {
    abstract String getName();
}
 abstract class BigCat2 extends Animal3 {
    protected abstract void roar();
}
 class Lion2 extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

     public static void main(String[] args) {
         Lion2 l2 = new Lion2();
         l2.roar();
     }
}

