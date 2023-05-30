package leetcodeprac;

import java.util.Arrays;

public class Solution {
//    static int[][] ar1;

    public static int[] twoSum(int[] numbs, int target) {
        int[] ar2;
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (target == numbs[i] + numbs[j]) {

                    return new int[]{i, j};
//                    ar2 = new int[]{i, j};
//                    ar1 = new int[][]{ar2};
//                    System.out.println("ar1 : "+ Arrays.toString(ar2));
                }
            }
        }
        return numbs;
    }

    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5};
        int target = 5;
        int[] ints = twoSum(numbs, target);
//        List<Integer> collect = Arrays.stream(ints).flatMap(Arrays::stream).collect(Collectors.toList());

        System.out.println(ints);

    }
}



