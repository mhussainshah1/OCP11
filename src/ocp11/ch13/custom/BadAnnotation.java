package ocp11.ch13.custom;

public @interface BadAnnotation {

    String name() default new String(""); // DOES NOT COMPILE
    String address() default "";
    String title() default null; // DOES NOT COMPILE
}
