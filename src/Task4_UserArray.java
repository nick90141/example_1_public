public class Task4_UserArray {
    public static int[] increase(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] element(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] newArray = increase(array);
        System.out.println("Элемент:");
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        int[] addedElementArray = element(array, 10);

        System.out.println("После  элемента:");

        for (int element : addedElementArray) {
            System.out.print(element + " ");
        }
    }
}