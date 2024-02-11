public class Pattern03 {
    //printing a Pyramid
//       4
//      2 3
//     1 2 3
//    0 1 2 3
    public static void main(String args[]) {
        int n = 5;
        int i, j, k;
        // outer loop to handle number of rows

        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" "); // only removing Space in this line will give us different type of Patterns

                //   inner loop to print number
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            // print new line for each row
        }

    }

    }

