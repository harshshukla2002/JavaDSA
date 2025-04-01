package searching.binarysearch;

/*
*
* You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
*
* */

public class NextGreaterLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';

        System.out.println(nextGreaterLetter(letters,target));
    }

    static char nextGreaterLetter(char[] letters, char target){
        int len = letters.length;
        int start = 0;
        int end = len - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return letters[start % len];
    }
}
