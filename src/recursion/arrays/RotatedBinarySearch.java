package recursion.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 1, 2, 3, 4};
        int target = 3;

        System.out.println(findElement(arr, target, 0, arr.length - 1));

    }

    static int findElement(int[] nums, int target, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) return mid;

        if (nums[start] <= nums[mid]) {
            if (target >= nums[start] && target <= nums[mid]) {
                return findElement(nums, target, start, mid - 1);
            } else {
                return findElement(nums, target, mid + 1, end);
            }
        }

        if (target >= nums[mid] && target <= nums[end]) {
            return findElement(nums, target, mid + 1, end);
        }

        return findElement(nums, target, start, mid - 1);
    }
}
