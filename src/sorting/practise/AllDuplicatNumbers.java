package sorting.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicatNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);

        System.out.println(ans);
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        sort(nums);

       for(int i=0;i<nums.length;i++){
           if(i+1 != nums[i]) res.add(nums[i]);
       }

        return res;
    }

    static void sort(int[] nums){
        int index = 0;

        while(index < nums.length){
            int correctIndex = nums[index] - 1;

            if(nums[index] != nums[correctIndex]) swap(nums, index, correctIndex);
            else index++;
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
