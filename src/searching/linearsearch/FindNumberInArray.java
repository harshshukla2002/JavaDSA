package searching.linearsearch;

public class FindNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("target found at index " + linearSearch(arr,4));
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) return -1;

        for(int index = 0;index < arr.length; index++){
            if (arr[index] == target) return index;
        }

        return -1;
    }
}
