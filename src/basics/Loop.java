package basics;

public class Loop {
    public static void main(String[] args) {
        // while loop
        int count = 1;
        while (count != 5){
            System.out.println("count is: " + count);
            count++;
        }

        // for loop
        for (int value = 1; value <= 5; value++){
            System.out.println("value is: " + value);
        }

        do {
            System.out.println("count is: " + count);
            count++;
        }while (count<=10);
    }
}
