package searching.binarysearch;

/*
*
* Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x. This element is called the ceil of x
*
* */

public class FindCeiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int target = 5;

        System.out.println(findCeiling(arr, target));
        System.out.println(findFloor(arr, target));
    }

    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
             return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return start;
    }

    static int findFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return end;
    }
}
