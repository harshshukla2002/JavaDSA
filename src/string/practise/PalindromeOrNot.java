package string.practise;

/*
* given a string check if it is palindrome or not, palindrome means given string is same as reverse or not.
*
* */

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "abba";

        System.out.println("From Method 1 " + palindromeOrNot(str));
        System.out.println("From Method 2 " + palindromeOrNot2(str));
    }

    // one method
    static boolean palindromeOrNot(String str){
        str = str.toLowerCase();

        String reverse = "";

        for(int i = str.length() - 1;i >= 0; i--){
            reverse += str.charAt(i);
        }

        return reverse.equals(str);
    }

    // another method
    static boolean palindromeOrNot2(String str){
        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while(start <= end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
