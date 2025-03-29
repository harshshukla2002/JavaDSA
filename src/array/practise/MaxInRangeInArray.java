package array.practise;

public class MaxInRangeInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,60,70,90,80};

        System.out.println("Max in arr in range between 1 and 4 is: " + MaxInRangeValue(arr, 1, 4));
    }

    static int MaxInRangeValue(int[] arr, int start, int end){
     int max = arr[start];

     for(int value = start; value <= end; value++){
         if (max < arr[value]) max = arr[value];
     }

     return max;
    }
}
