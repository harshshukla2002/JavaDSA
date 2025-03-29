package searching.linearsearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };

        int[] ans = searchElement(matrix, 5);

        System.out.println("element found at row " + ans[0] + " and col " + ans[1]);

        System.out.println("max element in matrix is " + maxInMatrix(matrix));
    }

    static int[] searchElement(int[][] matrix, int target){

        for (int row = 0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if (matrix[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

    static int maxInMatrix(int[][] matrix){
       int max = Integer.MIN_VALUE;

       for(int[] rowEl:matrix){
           for(int colEl:rowEl){
               if(colEl > max) max = colEl;
           }
       }

       return max;
    }
}

