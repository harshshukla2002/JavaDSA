package string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Harsh";

        System.out.println(Arrays.toString(name.toCharArray())); // [H, a, r, s, h]
        System.out.println(name.indexOf("r")); // 2
        System.out.println(Arrays.toString(name.split(""))); // [H, a, r, s, h]
    }
}
