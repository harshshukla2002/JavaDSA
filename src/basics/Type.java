package basics;

public class Type {
    public static void main(String[] args) {
        // type casting
        int num = (int)(37.89f);
        System.out.println(num);

        // byte
        int a = 258;
        byte b = (byte)(a);

        System.out.println(b);

        // type conversion
        int number = 'A';
        System.out.println(number);

        System.out.println(5 * 3.4); // gives me float value
    }
}
