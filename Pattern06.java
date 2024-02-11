public class Pattern06 {

//            0 1 2 3 4
//            1 2 3 4
//            2 3 4
//            3 4
//            4

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j< n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
