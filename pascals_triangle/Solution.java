package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> previousRow = null;
        List<Integer> row = null;
        for(int i = 0; i < numRows; i++){
            row = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    previousRow = triangle.get(i-1);
                    row.add(previousRow.get(j-1) + previousRow.get(j));

                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}

/*
1 row    1
2.row    1 1
3.row    1 2 1
4.row    1 3 3 1

0 1
1 1

nth (current row)
nth + (n-1)th (previous row)
*/
