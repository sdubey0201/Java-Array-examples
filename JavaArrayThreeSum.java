package com.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayThreeSum {
    public static void main(String[] args) {
//        To solve the "three-sum" problem,
//        where you need to find unique triplets in the array
//        that add up to zero, you can follow these steps:
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int targe = 0;
        System.out.println(getThreeSum1(nums, targe).toString());
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//        The distinct combinations are [-1,0,1] and [-1,-1,2].


    }

    public static List<List<Integer>> getThreeSum(int[] values, int target) {
//        Output: [[-1,-1,2],[-1,0,1]]
//        int [] nums = {-1,0,1,2,-1,-4};
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//
//        Explanation:
//
//        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//
//        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//
//        The distinct combinations are [-1,0,1] and [-1,-1,2].
//
//        Notice that the order of the output does not matter
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        List<List<Integer>> outPut = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            int a = values[i];
            for (int j = i + 1; j < values.length; j++) {
                int b = values[j];
                for (int k = j + 1; k < values.length; k++) {
                    int c = values[k];
                    int tempSum = a + b + c;
                    if (target == tempSum) {
                        List<Integer> list = Arrays.asList(a, b, c);
                        if (!outPut.contains(list))
                            outPut.add(list);
                    }
                }

            }

        }

        return outPut;
    }

    public static List<List<Integer>> getThreeSum1(int[] values, int target) {
//        Output: [[-1,-1,2],[-1,0,1]]
//        int [] nums = {-1,0,1,2,-1,-4};
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//
//        Explanation:
//
//        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//
//        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//
//        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//
//        The distinct combinations are [-1,0,1] and [-1,-1,2].
//
//        Notice that the order of the output does not matter
        List<List<Integer>> outPut = new ArrayList<>();
        Arrays.sort(values);
//        [-4, -1, -1, 0, 1, 2]
        int length = values.length;
        for (int i = 0; i < length; i++) {
            int temp = values[i];
            int left = i + 1;
            int right = length - 1;
            while (left < right) {
                int lv = values[left];
                int rv = values[right];
                int tempSump = lv + rv + temp;
                if (tempSump == target) {
                    List<Integer> tempList = Arrays.asList(lv, rv, temp);
                    if (!outPut.contains(tempList))
                        outPut.add(tempList);

                    left++;
                    right--;

                } else if (target>tempSump) {
                 left++;
                }else {
                    right--;
                }

            }

        }


        return outPut;

    }
}

