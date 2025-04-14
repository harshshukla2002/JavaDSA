package recursion.string;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        generatePermutation(str, "");

        System.out.println(generatePermutationList(str, ""));

        int permutationCount = getPermutationCount(str, "");
        System.out.println("Total permutation count is: " + permutationCount);
    }

    static void generatePermutation(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0, i);
            String s = res.substring(i);
            generatePermutation(str.substring(1), f + ch + s);
        }
    }

    static ArrayList<String> generatePermutationList(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0, i);
            String s = res.substring(i);
            ans.addAll(generatePermutationList(str.substring(1), f + ch + s));
        }

        return ans;
    }

    static int getPermutationCount(String str, String res){
        if (str.isEmpty()) {
            return 1;
        }

        char ch = str.charAt(0);
        int count = 0;

        for (int i = 0; i <= res.length(); i++) {
            String f = res.substring(0, i);
            String s = res.substring(i);
            count = count + getPermutationCount(str.substring(1), f + ch + s);
        }

        return count;
    }
}
