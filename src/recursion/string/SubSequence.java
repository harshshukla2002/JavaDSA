package recursion.string;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
        generateSubsequence(str, "");
        System.out.println(generateArraySubsequence(str, ""));
    }

    static void generateSubsequence(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }

        char ch = str.charAt(0);

        generateSubsequence(str.substring(1), res);
        generateSubsequence(str.substring(1), res + ch);
    }

    static ArrayList<String> generateArraySubsequence(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(res);
            return strList;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = generateArraySubsequence(str.substring(1), res);
        ArrayList<String> right = generateArraySubsequence(str.substring(1), res + ch);

        left.addAll(right);
        return left;
    }
}


