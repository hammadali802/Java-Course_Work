public class Pattern02 {
        //printing an upside down Pyramid

 //   0 1 2 3
//     1 2 3
//      2 3
//       4
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {


            for (int j = i; j >= 0; j--) {
                System.out.print(" ");

            }
            for (int k = i; k< n; k++) {
                System.out.print(k + " ");

            }
            System.out.println();


        }
    }
}
