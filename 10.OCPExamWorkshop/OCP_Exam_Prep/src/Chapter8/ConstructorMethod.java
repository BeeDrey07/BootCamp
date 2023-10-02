package Chapter8;

public class ConstructorMethod {
    public static void main(String[] args) {
//        EmptyStringCreator mr = String::new;
//        EmptyStringCreator l = () -> new String();
//        System.out.println("empty string" + mr.create());

        StringCopier mr = String::new;
        StringCopier l = s-> new String(s);
        System.out.println("hi there");
    }
}

interface EmptyStringCreator {
    String create();
}

interface StringCopier {
    String copy(String value);
}
