package recursion.easy;

public class SumOfDigit {
    public static void main(String[] args) {
        int num = 365;

        int ans = sumOfDigits(num);
        System.out.println(ans);
    }

    static int sumOfDigits(int n) {
        if (n <= 0) return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }
}
