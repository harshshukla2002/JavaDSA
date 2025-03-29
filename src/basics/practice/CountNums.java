package basics.practice;

public class CountNums {
    public static void main(String[] args) {
        int num = 233567323;
        int count = 0;

        while (num > 0){
            int rem = num % 10;
            if (rem == 3) count++;
            num = num / 10;
        }

        System.out.println("occurrence of 3 is: " + count);
    }
}
