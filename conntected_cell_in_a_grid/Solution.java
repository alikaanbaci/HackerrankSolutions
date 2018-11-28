package conntected_cell_in_a_grid;

import java.util.Stack;

public class Solution {
     private int region = 0;
     private int localRegion = 0;
     private int m, n;

    /**
     * NAME OF THE ALGORITHM DEPTH FIRST SEARCH
     * @param x
     * @param y
     * @param matrix
     */
     private void look(int x, int y, int[][] matrix) {
         if(x >= this.n || y >= this.m)
             return;
         if(x < 0 || y < 0)
             return;
         if(matrix[x][y] == -1)
             return;
         if(matrix[x][y] == 0)
             return;
         localRegion++;
         matrix[x][y] = -1;
         look(x-1, y-1, matrix);
         look(x-1, y, matrix);
         look(x-1, y+1, matrix);
         look(x, y-1, matrix);
         look(x, y+1, matrix);
         look(x+1, y-1, matrix);
         look(x+1, y, matrix);
         look(x+1, y+1, matrix);
     }
     public int connectedCell(int [][] matrix){
         this.n = matrix.length;
         this.m = matrix[0].length;
         System.out.println(n);
         System.out.println(m);
         for (int i = 0; i < m; i++){
             for(int j = 0; j < n; j++){
                 look(i, j, matrix);
                 if(localRegion > region)
                     region = localRegion;
                 localRegion = 0;
             }
         }
         return region;
     }
}















