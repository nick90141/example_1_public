public class Task3_ReversedArray {
    static int[] myReverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    static int[] subArray(int[] array, int index, int count) {
        int[] subArray = new int[count];
        for (int i = 0; i < count; i++) {
            if (index + i < array.length) {
                subArray[i] = array[index + i];
            } else {
                subArray[i] = 1;
            }
        }
        return subArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};

        int[] reversedArray = myReverse(array);
        printArray(reversedArray);

        int[] subArray = subArray(array, 1, 3);
        printArray(subArray);
    }
}