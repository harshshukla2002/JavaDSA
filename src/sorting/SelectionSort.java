package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0;i < n; i++){
            int last = n - i - 1;
            int max  = getMaxIndex(arr, 0,last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]) max = i;
        }

        return max;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
