package string;

import java.util.ArrayList;

public class StringOperators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); // d
        System.out.println("a" + 1); // a1
        System.out.println("string" + new ArrayList<>()); // string[]
    }
}
