package sorting.practise;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        cyclicSort(arr);

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0) return i + 1;
        }

        return arr.length;
    }

    static void cyclicSort(int[] arr){
        int index = 0;

        while (index < arr.length) {
            int correctIndex = arr[index] - 1;
            if (arr[index] != arr[correctIndex]) {
                swap(arr, index, correctIndex);
            } else {
                index++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
