package basics;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        System.out.print("enter any number: ");
        Scanner input = new Scanner(System.in);
        boolean isOdd = input.nextInt() % 2 == 1;

        // if condition
        if(isOdd){
            System.out.println("given number is odd");
        }else {
            System.out.println("given number is even");
        }
    }
}
