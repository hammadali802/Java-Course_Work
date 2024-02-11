public class Pattern07 {
    //printin Pattern using Looops
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 1; i <= n; i++) {
            // inner loop to print space

            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            // print new line for each row
        }
    }
}
