/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Bianca
 */
public class WritingLiterals {

    public static void main(String[] args) {
//        long max = 3123456789L;
//        double notAtStart = 1_000_000.00;
//        System.out.println(notAtStart);
//
//        String s = "Hello";
//        System.out.println(s.length());

//        int len = s.length();
//        len.length(): // wont't compile
//        len = null; // won't compile
//        
//        s = null; 
//        Integer len = s.length();
//        System.out.println(len.equals(s));
//        int i = Integer.parseInt("1234");
//        Integer i2 = Integer.parseInt("123");
//        System.out.println(i2);
//        i.equals(i2) // wont't compile 
//        i2.equals(12);
//       var blocky = """
// squirrel \s
// pigeon \
// termite""";
// System.out.print(blocky);

var num1 = Long.parseLong("100");
 var num2 = Long.valueOf("100");
 System.out.println(Long.max(num1, num2));

    }
}
