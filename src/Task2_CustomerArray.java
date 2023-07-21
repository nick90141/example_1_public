import java.util.Scanner;

public class Task2_CustomerArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int N = in.nextInt();

        int[] array = new int[N];

        wholeNumber(N, array);
        minNumber(N, array);
        maxNumber(N, array);
        amountNumber(N, array);
        averageCount(N, array);
        oddNumber(N, array);
    }

    static int[] wholeNumber(int N, int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите елементы массива целыми числами:");
        for (int i = 0; i < N; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        return array;
    }

    static int[] minNumber(int N, int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Минимальное число: " + min);
        return array;
    }

    static int[] maxNumber(int N, int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Максимальное число: " + max);
        return array;
    }

    static int[] amountNumber(int N, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма: " + sum);
        return array;
    }

    static int[] averageCount(int N, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Среднее арифмитическое: " + sum / N);
        return array;
    }

    static int[] oddNumber(int N, int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0) {
                System.out.println("Нечетное число: " + array[i]);
            }
        return array;
    }
}

