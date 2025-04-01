package searching.binarysearch;

public class InsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,10};
        int target = 9;

        System.out.println(insertPosition(arr, target));
    }

    static int insertPosition(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid -1;
            else return mid;
        }

        return end + 1;
    }
}
