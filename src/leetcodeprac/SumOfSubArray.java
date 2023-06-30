package leetcodeprac;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfSubArray {

    //Print all subarrays with 0 sum
    //Given an integer array, print all subarrays with zero-sum.
    //For  example:
    //Input:  { 4, 2, -3, -1, 0, 4 }
    //
    //Subarrays with zero-sum are
    //
    //{ -3, -1, 0, 4 }
    //{ 0 }
    //
    //Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
    //
    //Subarrays with zero-sum are
    //
    //{ 3, 4, -7 }
    //{ 4, -7, 3 }
    //{ -7, 3, 1, 3 }
    //{ 3, 1, -4 }
    //{ 3, 1, 3, 1, -4, -2, -2 }
    //{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }

    public static void main(String[] args) {

        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int[] arr = new int[nums.length];
            int f=0;
            arr[f] = nums[i];
            sum += nums[i];
            for (int j = i+1; j < nums.length; j++) {
                f++;
                arr[f] = nums[j];
                sum += nums[j];
                if (sum == 0) {
                    IntStream intStream = Arrays.stream(arr).filter(s -> s != 0);
                    System.out.println(Arrays.toString(intStream.toArray()));

                }
            }
        }
    }
}
