package recursion.easy;

public class From1ton {
    public static void main(String[] args) {
        printNumFromnto1(5);
        printNumFrom1ton(5);
    }

    static void printNumFromnto1(int n) {
        if (n == 0) return;

        System.out.println(n);
        printNumFromnto1(n - 1);
    }

    static void printNumFrom1ton(int n){
        if(n==0) return;

        printNumFrom1ton(n-1);
        System.out.println(n);
    }
}
