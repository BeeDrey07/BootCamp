package Chapter8;

public class MethodReferences {
    public static void main(String[] args) {
        LearnToSpeak l = s -> {
            System.out.println("The sound the duck is making is: " + s + " " + s);
            System.out.println();
        };
        DuckHelper.teacher("quack", l);
    }
}

interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
        // Exercise patience (omitted)
        trainer.speak(name);
    }
}
//class Duckling {
//    public static void makeSound(String sound){
//        LearnToSpeak learner = s -> System.out.println(s);
//        DuckHelper.teacher(sound, learner);
//    }
//}