package basics;

public class Overloading {
    public static void main(String[] args) {
        fun(1); // automatically goes to integer fun
        fun("Helloo"); // automatically goes to string fun
        sum(1, 2);
        sum(1, 2, 3);
    }

    static void fun(int a){
        System.out.println("This is integer " + a);
    }

    static void fun(String name){
        System.out.println("This is string " + name);
    }

    static void sum(int a, int b){
        int sum = a + b;
        System.out.println("This is two param func " + sum);
    }

    static void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("This is three param func " + sum);
    }
}
