public class Pattern05 {


 //   1 2 3 4
//     1 2 3
//      2 3
//       4

//       1
//      1 2
//     1 2 3
//    1 2 3 4
public static void main(String args[]) {
        int n = 5;
        int i, j, k;
        // outer loop to handle number of rows
        for ( i = 1; i <= n; i++) {
            for (j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = i; k< n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
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
