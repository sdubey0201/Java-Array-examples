import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {1, 4, 7, 10, 11};
        int arr2[] = {2, 3, 8, 16, 20};
        int  l1 = arr1.length;
        int l2 = arr2.length;
        int [] outPut = new int[l1+l2];
        int i = 0,j = 0,k = 0;
        while (i<l1 && j<l2){
            if (arr1[i]<=arr2[j]){
                outPut[k]= arr1[i];
                i++;
                k++;
            }else {
                outPut[k]= arr2[j];
                k++;
                j++;
            }
        }
        while (i<l1){
            outPut[k] = arr1[i];
            i++;
            k++;
        }
        while (j<l2){
            outPut[k] = arr1[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(outPut));

//        Set<Integer> integerSet = new TreeSet<>();
//        integerSet.addAll(Arrays.asList(arr1));
//        integerSet.addAll(Arrays.asList(arr2));
//        System.out.println(integerSet.toString());
    }
}
