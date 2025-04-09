package recursion.arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 4, 2};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;

        if (arr[index] < arr[index + 1]) return isSorted(arr, index + 1);

        return false;
    }
}
