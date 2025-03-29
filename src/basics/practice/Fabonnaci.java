package basics.practice;

import java.util.Scanner;

public class Fabonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
