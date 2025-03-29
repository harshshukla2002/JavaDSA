package basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,5,6,67,56);
        multiple("harsh", 20, "Home", "Village", "College");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(String name, int age, String ...rest){
        System.out.println("Heyy, " + name + " age is " + age + " rest are " +Arrays.toString(rest));
    }
}
