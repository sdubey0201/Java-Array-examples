package com.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayThreeSum {
    public static void main(String[] args) {

    }
    public static List<List<Integer>>getThreeSum(int [] values,int target){
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
        for (int i = 0;i<values.length;i++){
            int a = values[i];
            for (int j = i+1;j<values.length;j++){
                int b = values[j];
                for (int k = j+1;k<values.length;k++){
                    int c = values[k];
                    int tempSum = a+b+c;
                    if (target==tempSum){
                        outPut.add(Arrays.asList(a,b,c));
                    }
                }

            }

        }

        return outPut;
    }

    public static List<List<Integer>>getThreeSum1(int [] values,int target){
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


        return outPut;
    }


}
