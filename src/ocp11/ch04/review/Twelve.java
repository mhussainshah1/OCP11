package ocp11.ch04.review;

public class Twelve {

    public static void main(String[] args) {
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
//      A.
        int q = wolf.length;
        for (;;) {
            System.out.print(wolf[--q]);
            if (q == 0) {
                break;
            }
        }
        
//      B.
        for (int m = wolf.length - 1; m >= 0; --m) {
            System.out.print(wolf[m]);
        }
        
////      C.
//        for (int z = 0; z < wolf.length; z++) {
//            System.out.print(wolf[wolf.length - z]);
//        }

//      D.
        int x = wolf.length - 1;
        for (int j = 0; x >= 0 && j == 0; x--) {
            System.out.print(wolf[x]);
        }
        
////      E.
//        final int r = wolf.length;
//        for (int w = r - 1; r > -1; w = r - 1) {
//            System.out.print(wolf[w]);
//        }
////      F.
//        for (int i = wolf.length; i > 0; --i) {
//            System.out.print(wolf[i]);
//        }
    }
}
