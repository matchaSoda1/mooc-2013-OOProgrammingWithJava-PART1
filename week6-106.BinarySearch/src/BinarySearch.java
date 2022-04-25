
public class BinarySearch {

    public static boolean search(int[] array, int srch) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] == srch) {
                return true;
            } else if (srch > array[middle]) {
                start=middle+1;
            } else {
                end=middle-1;
            }
        }
        return false;

    }

}
