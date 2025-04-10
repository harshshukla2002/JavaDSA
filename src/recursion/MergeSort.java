package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 1, 2, 9};
//        System.out.println(Arrays.toString(mergeSort(arr)));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left, right);
    }

    static int[] mergeArray(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    static void mergeSortInPlace(int[] arr, int start, int end){
        if(end - start == 1) return;

        int mid = start + (end - start) / 2;

        mergeSortInPlace(arr, start, mid);
       mergeSortInPlace(arr, mid, end);

       mergeArrayInPlace(arr, start, mid,end);
    }

    static void mergeArrayInPlace(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }else {
                mix[k++] = arr[j++];
            }
        }

        while(i < mid){
            mix[k++] = arr[i++];
        }

        while(j < end){
            mix[k++] = arr[j++];
        }

        for(int l =0;l<mix.length;l++){
            arr[start + l] = mix[l];
        }
    }
}
