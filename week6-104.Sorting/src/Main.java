
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] values = {3, 12, 5, 4, 8, 1};
        
        sort(values);

    }

    public static int smallest(int[] array) {

        int minimum = array[0];

        for (int i : array) {
            if (i < minimum) {
                minimum = i;
            }

        }

        return minimum;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = -1;
        int smallest = smallest(array);

        for (int i : array) {
            index++;
            if (i == smallest) {
                break;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startNum) {
        //method name is too long - suggest something like minIndexFrom or indexOfMinFrom

        int minimum = array[startNum];
        int index = startNum;

        for (int i = startNum; i < array.length; i++) {

            if (array[i] < minimum) {
                minimum = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        int val2 = array[index2];

        array[index1] = val2;
        array[index2] = val1;
    }

    public static void sort(int[] array) {

        
        for (int i = 0; i<array.length; i++) {
        swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        System.out.println(Arrays.toString(array));
        }
        
    }
}
