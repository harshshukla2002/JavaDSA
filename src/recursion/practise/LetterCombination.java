package recursion.practise;

/*
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
*/

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        String digits = "12";

        System.out.println(generateCombination(digits, ""));

    }


    // if digits starts from 1 to 9 and every value is 3 (not similar to phone pad)
    static ArrayList<String> generateCombination(String digits, String res){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        int digit = digits.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for(int i=(digit-1) * 3; i < digit * 3; i++){
            char ch = (char)('a' + i);

            ans.addAll(generateCombination(digits.substring(1), res + ch));
        }

        return ans;
    }

    // if digits starts from 2 to 9 (similar to phone pad)
    static  ArrayList<String> generateCombination2(String digits, String res) {
        String[] mapping = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        int digit = digits.charAt(0) - '0';

        String letters = mapping[digit];

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            ans.addAll(generateCombination2(digits.substring(1), res + letters.charAt(i)));
        }

        return ans;
    }
}
