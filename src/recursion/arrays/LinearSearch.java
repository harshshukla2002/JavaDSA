package recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {32, 5, 65, 67, 79, 79, 79, 45, 7};
        int target = 79;
        ArrayList<Integer> res = new ArrayList<>();

        System.out.println(searchElement(arr, target, 0));
        System.out.println(findAllOccurrence(arr, target, 0, res));
    }

    static int searchElement(int[] arr, int target, int index) {
        if (index == arr.length) return -1;

        if (arr[index] != target) return searchElement(arr, target, index + 1);

        return index;
    }

    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) return -1;

        if (arr[index] != target) return searchElement(arr, target, index - 1);

        return index;
    }

    static ArrayList<Integer> findAllOccurrence(int[] arr, int target, int index, ArrayList<Integer> res) {
        if (index == arr.length) return res;

        if (arr[index] == target) res.add(index);

        return findAllOccurrence(arr, target, index + 1, res);
    }
}
