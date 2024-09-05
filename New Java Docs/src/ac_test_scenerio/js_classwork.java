package ac_test_scenerio;
import java.util.Arrays;

public class js_classwork {
    public static void main(String[] args) {
        int [] given1 = {1, 2, 3, 4, 5};
        int [] given2 = {4, 5, 2, 1, 6};
    System.out.println(Arrays.toString(reversedArrayFunc(given1)));
    System.out.println(Arrays.toString(reversalMethod(given2)));
    }


    public static int[] reversedArrayFunc(int []array) {
        int[] reversed = new int[array.length];
        int temp = 0;
        for (int index = 0; index < array.length; index++) {
            temp = array.length - 1 - index;
            reversed[temp] = array[index];
        }
        return reversed;
    }

    public static int[] reversalMethod(int []array) {
        int[] reversed = new int[array.length];
        int temp = 0;
        for(int index = array.length - 1; index >= 0; index--) {
            temp = array.length - 1 - index;
            reversed[temp] = array[index];
        }
        return reversed;
    }
}
