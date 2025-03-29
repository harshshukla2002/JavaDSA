package array;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][];

        // or
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        for(int[] el: arr2){
            System.out.println(Arrays.toString(el));
        }
    }
}
