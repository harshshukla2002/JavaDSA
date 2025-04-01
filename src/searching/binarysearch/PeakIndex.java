package searching.binarysearch;

/*
*
* You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
*
* */

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};

        System.out.println(findPeakElement(arr));
    }

    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) /2;

            if(arr[mid] > arr[mid+1]) end = mid;
            else start = mid + 1;
        }

        return start;
    }
}
