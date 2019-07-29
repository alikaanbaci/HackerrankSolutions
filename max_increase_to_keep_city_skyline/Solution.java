package max_increase_to_keep_city_skyline;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int [] col = new int[n];
        int [] row = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] < Math.min(row[i], col[j])){
                    sum += Math.min(row[i], col[j]) - grid[i][j];
                }
            }
        }
        return sum;
    }
}
