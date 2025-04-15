package recursion.practise;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
        System.out.println(dices("", target));
    }

    static ArrayList<String> dices(String res, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dices(res + i, target - i));
        }

        return ans;
    }
}
