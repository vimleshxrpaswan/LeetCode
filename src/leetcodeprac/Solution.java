package leetcodeprac;

import java.util.Arrays;

public class Solution {

    public static int[] twoSum(int[] numbs, int target) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (target == numbs[i] + numbs[j]) {

                    return new int[]{i, j};
                }
            }
        }
        return numbs;
    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5};
        int target = 8;
        int[] ints = twoSum(numbs, target);
        System.out.println(Arrays.toString(ints));

    }
}



