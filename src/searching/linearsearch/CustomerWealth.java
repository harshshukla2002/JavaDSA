package searching.linearsearch;

public class CustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int max = Integer.MIN_VALUE;

        for (int[] rowEl : accounts) {
            int sum = 0;
            for (int colEl : rowEl) {
                sum += colEl;
            }

            if (sum > max)
                max = sum;
        }

        System.out.println(max);
    }
}
