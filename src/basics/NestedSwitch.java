package basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter emp id: ");
        int empId = input.nextInt();

        switch (empId){
            case 1 -> System.out.println("Harsh");
            case 2 -> System.out.println("Sandeep");
            case 3 -> {
                System.out.print("Enter department: ");
                String department = input.next();

                switch (department){
                    case "IT" -> System.out.println("Avinash from IT Department");
                    case "HR" -> System.out.println("Avinash from HR Department");
                    case "Management" -> System.out.println("Avinash from Management Department");
                    default -> System.out.println("enter valid department");
                }
            }
            default -> System.out.println("enter valid emp id");
        }

    }
}
