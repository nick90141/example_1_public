public class Task5 {
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

    }
}

