import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] list = { 4, 2, 1, 3, 9, 4, 2, 5, 2, 7, 1, 8, 2, 1, 6 };
        int[] list2 = { 4, 2, 1, 3, 9, 4, 2, 5, 2, 7, 1, 8, 2, 1, 6 };
        int[] list3 = { 4, 2, 1, 3, 9, 4, 2, 5, 2, 7, 1, 8, 2, 1, 6 };

        System.out.println("Unsorted Integer Array: " + Arrays.toString(list) + "\n");

        int[] insertionSorted = insertionSort(list);
        System.out.println("Insertion sort: " + Arrays.toString(insertionSorted) + "\n");

        int[]  selectionSorted = selectionSort(list2);
        System.out.println("Selection sort: " + Arrays.toString(selectionSorted) + "\n");

        int[] variationOfSelectionSorted = variationOfSelection(list3);
        System.out.println("variation of selection sort: " + Arrays.toString(variationOfSelectionSorted) + "\n");

        int[] strangeSorted = variationOfSelection(list3);
        System.out.println("variation of selection sort: " + Arrays.toString(strangeSorted) + "\n");
    }

    private static int[] insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[i - 1]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                for (int x = i - 1; x >= 1; x--) {
                    if (array[x] < array[x - 1]) {
                        int temp2 = array[x - 1];
                        array[x - 1] = array[x];
                        array[x] = temp2;
                    }
                }
            }
        }
        return array;
    }

    private static int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int pos = i;
            for(int x = i; x < array.length; x++) {
                if(array[x] < minValue) {
                    minValue = array[x];
                    pos = x;
                }
            }
            int temp = array[i];
            array[i] = minValue;
            array[pos] = temp;
        }
        return array;
    }

    static int[] mergeSort(int[] array) {
        return array;
    }

    private static int[] variationOfSelection(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minValue = array[i];
            for(int x = i; x < array.length; x++) {
                if(array[x] < minValue) {
                    minValue = array[x];
                    int temp = array[i];
                    array[i] = minValue;
                    array[x] = temp;
                }
            }
        }
        return array;
    }
}
