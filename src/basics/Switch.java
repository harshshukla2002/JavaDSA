package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();

        switch (fruit) {
            case "Mango" -> System.out.println("Mango is sweet");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Did you enter fruit name? Please enter valid fruit name");
        }
    }
}
