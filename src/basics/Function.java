package basics;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        System.out.println("Multiple of value is " + Multiply());
        System.out.println("Subtraction of value is " + Subtract(3,4));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String enteredName = input.next();

        greet(enteredName);
    }

    // function which doesn't return something
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }

    // function which return something
    static int Multiply(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        return num1 * num2;
    }

    static int Subtract(int num1, int num2){
        return num1 - num2;
    }

    static void greet(String name){
        System.out.println("Hello " + name);
    }
}
