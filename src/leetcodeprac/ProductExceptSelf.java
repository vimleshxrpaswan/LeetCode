package leetcodeprac;

import java.util.ArrayList;
import java.util.List;

public class ProductExceptSelf {
        public static void main(String[] args) {
            int[]  arr= {1, 2, 3, 4, 5};
            List<Integer> resultList = new ArrayList<>();
            int resultValue = 1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j)
                        continue;
                    resultValue *= arr[j];
                }
                resultList.add(resultValue);
                resultValue = 1;
            }
            System.out.println(resultList);
        }
    }