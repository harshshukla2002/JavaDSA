package practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if (isPrime(num)){
            System.out.println(num + " number is prime");
        }else {
            System.out.println(num + " number is not prime");
        }
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2;i < num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
