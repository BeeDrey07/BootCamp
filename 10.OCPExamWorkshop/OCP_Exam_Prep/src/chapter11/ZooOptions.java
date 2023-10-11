package chapter11;

import java.util.Properties;

public class ZooOptions {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel", "Bob")); // null
        System.out.println(props.getProperty("open", "Bob")); // Bob

        System.out.println(props.get("open")); // 10am
//        System.out.println(props.get("open", "The zoo will be open soon")); // DOES NOT COMPILE);
    }
}