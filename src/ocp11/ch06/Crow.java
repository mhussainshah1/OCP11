package ocp11.ch06;

import java.util.function.Consumer;

//public class Crow {
//
//    private String color;
//
//    public void caw(String name) {
//        String volume = "loudly";
//        Consumer<String> consumer = s 
//                -> System.out.println(name + " says "
//                        + volume + " that she is " + color);
//    }
//}

public class Crow {

    private String color;

    public void caw(String name) {
        String volume = "loudly";
        name = "Caty";
        color = "black";

        Consumer<String> consumer = s
                -> System.out.println(name + " says "
                        + volume + " that she is " + color);
        volume = "softly";
    }
}
