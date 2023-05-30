package leetcodeprac;



public class Solution {


    public static int[] twoSum(int[] numbs, int target) {
        int[] ar2;
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
        int target = 5;
        int[] ints = twoSum(numbs, target);
        System.out.println(ints);

    }
}



