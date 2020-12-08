package ocp11.ch16.exception;

public class TurkeyCage implements AutoCloseable {

    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (var t = new TurkeyCage()) {
            System.out.println("Put turkeys in");
        }
    }
}