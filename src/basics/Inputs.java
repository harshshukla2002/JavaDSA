package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // integer value
//        System.out.println("enter your age: ");
//        int age = input.nextInt();
//        System.out.println("your age is " + age);

        // string whole line value
//        System.out.print("enter something: ");
//        String value = input.nextLine();
//        System.out.println(value);

        // string single line value
//        System.out.print("enter your name: ");
//        String name = input.next();
//        System.out.println("Hello " + name);

        // to take float value
        System.out.print("enter your marks: ");
        float marks = input.nextFloat();
        System.out.println("Your marks are " + marks);
    }
}
