package array.practise;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.println("Max in arr is: " + MaxValue(arr));
    }

    static int MaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int value : arr){
            if(max < value) max = value;
        }

        return max;
    }
}
