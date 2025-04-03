package sorting.practise;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(allMissingNumber(arr));
    }

    static List<Integer> allMissingNumber(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();

        cyclicSort(arr);

        for(int i = 0; i< arr.length; i++){
            if(i != arr[i]-1) res.add(i+1);
        }

        return res;
    }

    static void cyclicSort(int[] arr){
        int index = 0;

        while (index < arr.length) {
            int correctIndex = arr[index] - 1;
            if (arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
}
