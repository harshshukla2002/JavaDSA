package searching.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("item found at index " + searchInRange(arr,1,4,3));
        System.out.println("minimum number found between range is " + minimumNumberInRange(arr,1,4));
    }

    static int searchInRange(int[] arr, int start, int end, int target){
        if (arr.length == 0) return -1;

        for(int index = start; index <= end; index++){
            if(arr[index] == target) return index;
        }

        return -1;
    }

    static int minimumNumberInRange(int[] arr, int start, int end){
        int min = Integer.MAX_VALUE;

        for(int index = start; index <= end; index++){
            if(arr[index] < min) min = arr[index];
        }

        return min;
    }
}
