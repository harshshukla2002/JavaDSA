package searching.binarysearch;

/*
*
* Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
*
* */

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,100,130,140,160,170};
        int target = 130;
        System.out.println(findIndex(arr,target));
    }

    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;

            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }

            start = temp;
        }

        return search(arr,target,start,end);
    }

    static int search(int[] arr, int target, int start, int end){
        while(start <=  end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid +1;
            else return mid;
        }

        return -1;
    }
}
