package ocp11.ch04.review;

public class Eleven {

    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B':'C':
                System.out.print("great ");
            case 'D':
                System.out.print("good ");
                break;
            case e:
            case 'F':
                System.out.print("not good ");
        }
    }
}
