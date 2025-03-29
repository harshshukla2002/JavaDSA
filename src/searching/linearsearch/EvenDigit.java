/*
*
* question - Given an array nums of integers, return how many of them contain an even number of digits.
*
* */

package searching.linearsearch;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findEvenDigit(arr));
    }

    static int findEvenDigit(int[] nums){
        int result = 0;

        for(int value: nums){
            if (isEven(value)) result++;
        }

        return result;
    }

    static boolean isEven(int n){
        int count = 0;

        while(n > 0){
         count++;
         n = n/10;
        }

        return count%2 == 0;
    }
}
