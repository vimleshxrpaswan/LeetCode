package leetcodeprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        String str = "MCMXCIV";
        int total = 0;
        int length = str.length();
        for (int i = 0; i<str.length(); i++) {

            if ((i+1 != str.length()) && characterIntegerMap.get(str.charAt(i)) > characterIntegerMap.get(str.charAt(i+1))) {
                total = total + characterIntegerMap.get(str.charAt(i));
            } else if ((i+1 != str.length()) && characterIntegerMap.get(str.charAt(i)) < characterIntegerMap.get(str.charAt(i+1))){
                int sub = characterIntegerMap.get(str.charAt(i+1)) - characterIntegerMap.get(str.charAt(i));
                total = total + sub;
                i++;
            } else if ((i+1 != str.length()) && Objects.equals(characterIntegerMap.get(str.charAt(i)), characterIntegerMap.get(str.charAt(i + 1)))){
                total = total + characterIntegerMap.get(str.charAt(i));
            } else {
                total = total + characterIntegerMap.get(str.charAt(i));
            }
        }
        System.out.println(total);

    }
}

