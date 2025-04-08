package recursion.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int digits = (int) (Math.log10(num)) + 1;
        System.out.println(reverseNum(num, digits));
    }

    static int reverseNum(int n, int digits) {
        if (n % 10 == n) return n;

        int rem = n % 10;

        return rem * (int) (Math.pow(10, digits - 1)) + reverseNum(n / 10, digits - 1);
    }
}
