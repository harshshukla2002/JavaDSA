package basics.practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.print("Enter a operator: ");
            char operator = input.next().trim().charAt(0);

            if (operator == '*' || operator == '+' || operator == '-' || operator == '/' || operator == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (operator == '+') ans = num1 + num2;
                else if (operator == '-') ans = num1 - num2;
                else if (operator == '*') ans = num1 * num2;
                else if (operator == '/') ans = num1 / num2;
                else ans = num1 % num2;
            }else if(operator=='x' || operator=='X'){
                System.out.println("you escaped");
                break;
            }else {
                System.out.print("Invalid input please enter valid number");
            }
        System.out.println("Answer: " + ans);
        }
        System.out.println("----Calculator ended-----");
    }
}
