package sorting.practise;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,2};

        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){
        int index = 0;

        while(index < arr.length){
            if(index + 1 != arr[index]){
                int correctIndex = arr[index] - 1;

                if(arr[index] != arr[correctIndex]) swap(arr, index, correctIndex);
                else return arr[index];
            }else index++;
        }

        return -1;
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
