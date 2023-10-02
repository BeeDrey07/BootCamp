package Chapter8;

public class InstanceMethods {
    public static void main(String[] args) {
//        String str = "zoo";
//        StringStart mr = str::startsWith;
////        StringStart l = s -> str.startsWith("s");
//        System.out.println(mr.beginningCheck("0"));

//        String str = " ";
//        StringChecker mr = str::isEmpty;
////        StringChecker l = () -> str.isEmpty();
//        System.out.println(mr.check());

//        StringParameterChecker mr = String::isEmpty;
//        StringParameterChecker l = (s) -> s.isEmpty();
//        System.out.println(mr.check("zoo"));

        String2ParameterChecker mr = String::startsWith;
//        String2ParameterChecker l = (s, p) -> s.startsWith(p);
        System.out.println(mr.beginningCheck("zoo", "z"));
    }

}

interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

interface StringParameterChecker {
    boolean check(String text);
}

interface String2ParameterChecker {
    boolean beginningCheck(String text, String prefix);
}