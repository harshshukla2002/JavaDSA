package searching.binarysearch;

/*
*
* Given a sorted array and a value x, find the element of the floor of x. The floor of x is the largest element in the array smaller than or equal to x.
*
* */

public class FindFloor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int target = 5;

        System.out.println(findFloor(arr, target));
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
