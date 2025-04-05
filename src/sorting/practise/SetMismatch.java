package sorting.practise;

/*
*
* You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
* */

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    static int[] setMismatch(int[] arr){
        sort(arr);

        for(int i = 0;i < arr.length; i++){
            if(arr[i] != i + 1) return new int[]{arr[i], i + 1};
        }

        return new int[]{-1,-1};
    }

    static void sort(int[] arr){
        int index = 0;

        while(index < arr.length){
            int correctIndex = arr[index] - 1;

            if(arr[index] != arr[correctIndex]) swap(arr, index, correctIndex);
            else index++;
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
