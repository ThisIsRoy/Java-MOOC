
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int val: array) {
            if (val < smallest) {
                smallest = val;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int smallestIdx = -1;

        for (int idx = 0; idx < array.length; idx++) {
            if (array[idx] < smallest) {
                smallest = array[idx];
                smallestIdx = idx;
            }
        }

        return smallestIdx;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = Integer.MAX_VALUE;
        int smallestIdx = -1;

        for (int idx = index; idx < array.length; idx++) {
            if (array[idx] < smallest) {
                smallest = array[idx];
                smallestIdx = idx;
            }
        }

        return smallestIdx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int val2 = array[index2];
        array[index2] = array[index1];
        array[index1] = val2;
    }

    public static void sort(int[] array) {
        int smallestIdx;

        for (int i = 0; i < array.length; i++) {
            smallestIdx = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIdx);
        }
    }
}
