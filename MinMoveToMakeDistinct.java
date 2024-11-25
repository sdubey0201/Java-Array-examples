import java.util.Arrays;

public class MinMoveToMakeDistinct {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int [] array = {1,2,1};
//        System.out.println(findMinMoveToMakeDistinct(array));

        int [] array1 = {3, 2, 1, 2, 1, 7};
        System.out.println(findMinMoveToMakeDistinct(array1));
    }

    public static int findMinMoveToMakeDistinct(int[] array) {
        int move = 0;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                int newValue = array[i - 1] + 1;
                move+=newValue-array[i];
                array[i]=newValue;
            }
        }
        System.out.println(Arrays.toString(array));
        return move;
    }
}