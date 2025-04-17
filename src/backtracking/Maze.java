package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        System.out.println(getPaths("", 3, 3));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    static ArrayList<String> getPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> strList = new ArrayList<>();
            strList.add(p);
            return strList;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (r > 1) ans.addAll(getPaths(p + "D", r - 1, c));
        if (c > 1) ans.addAll(getPaths(p + "R", r, c - 1));

        return ans;
    }
}
