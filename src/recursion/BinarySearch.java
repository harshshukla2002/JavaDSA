package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 46, 67, 78, 89};
        int target = 78;

        System.out.println(binarySearch(arr, 78, 0, arr.length - 1));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) return mid;

        if (target < arr[mid]) return binarySearch(arr, target, start, mid - 1);

        return binarySearch(arr, target, mid + 1, end);
    }
}
