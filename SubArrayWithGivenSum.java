import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int[] arr = {1, 4, 20, 3, 10, 5};
//        int targetSum = 33;
//        int[] arr = {2, 6, 4, 3, 8, 9 , 10};
//        int targetSum = 7;
//        int[] arr = {2, 6, 4, 3, 8, 9 , 10};
//        int targetSum = 13;
        int[] arr = {2, 6, 4, 3, 7, 9 , 10};
        int targetSum = 15;

        System.out.println(findSubArrayWithSum(arr,targetSum));

    }

    public static List<Integer> findSubArrayWithSum(int [] items,int target){
        int[]  outPut = new int[2];
        for (int i = 0;i<items.length;i++){
            int temp = items[i];
            if (temp == target){
                outPut[0]=i;
                break;
            }
            for (int j = i+1;j<items.length;j++){
               temp +=items[j];
               if (temp == target){
                   outPut[0]=i;
                   outPut[1]=j;
                   break;
               } else if (temp>target) {
                   break;
               }
            }
        }
        System.out.println(outPut.toString());
        List<Integer>list = new ArrayList<>();
        for (int i = outPut[0]; i <=outPut[1] ; i++) {
            list.add(items[i]);
        }

        return list;

    }


}