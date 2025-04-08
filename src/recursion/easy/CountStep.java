package recursion.easy;

public class CountStep {
    public static void main(String[] args) {
        int num = 14;

        System.out.println(stepsCount(num, 0));
    }

    static int stepsCount(int num, int steps) {
        if (num == 0) return steps;

        if (num % 2 == 0) return stepsCount(num / 2, steps + 1);

        return stepsCount(num - 1, steps + 1);
    }
}
