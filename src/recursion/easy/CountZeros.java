package recursion.easy;

public class CountZeros {
    public static void main(String[] args) {
        int num = 300230;

        System.out.println(count(num , 0));
    }

    static int count(int num, int c){
        if(num==0) return c;

        int rem = num % 10;

        if(rem == 0) return count(num/10, c+1);

        return count(num/10, c);
    }
}
