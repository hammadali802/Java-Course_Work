public class Pattern01 {

   // Printing this Pattern using Modulous Operator;
//    X_X_X_X_X_
//    X__X__X__X
//    X___X___X_

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (j%i ==0 ) {System.out.print("X");}
                else {
                    System.out.print("_");
                }
            }
            System.out.println();

        }
    }
}