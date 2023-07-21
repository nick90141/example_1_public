public class Task6 {
    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] summa = method(arr1, arr2);
    }

    static int[][] method(int[][] arr1, int[][] arr2) {

        int[][] summa = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                summa[i][a] = arr1[i][a] + arr2[i][a];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(summa[i][a] + " ");
            }
            System.out.println();
        }
        return summa;
    }
}

