package diagonal_difference;

public class Solution {
    public int diagonalDifference(int[][] arr) {
        int size = arr.length;
        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++){
            left+= arr[i][i];
        }
        for (int i = 0, j = size-1; i < size; i++, j--){
            right+= arr[i][j];
        }
        return Math.abs(right-left);
    }
}
