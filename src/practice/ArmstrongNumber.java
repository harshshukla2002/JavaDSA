package practice;

// given three digits number and if we make cube of that three digits number and add those number then the sum is also should be the same number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int num = input.nextInt();
//        System.out.println(isArmstrong(num) ? num + " is armstrong number" : num + " is not armstrong number");

        System.out.println("All three digit armstrong number");
        for(int num = 100; num < 1000; num++){
            if (isArmstrong(num)){
                System.out.print(num + " ");
            }
        }
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;

        while(num > 0){
            int rem = num%10;
            int cube = rem * rem * rem;
            sum += cube;
            num = num / 10;
        }

        return sum==temp;
    }
}
