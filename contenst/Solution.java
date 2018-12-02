package contenst;

import java.util.ArrayList;
import java.util.List;

public class Solution {
     public int solve(int h, List<Integer> wallPoints, List<Integer> lengths) {
         int wallPoint = 0, length = 0;
         int res = 0;
         for (int i = 0; i < wallPoints.size(); i++){
             wallPoint = wallPoints.get(i);
             length = lengths.get(i);
             Double result = wallPoint - length * 0.25;
             Double max = result - h;
             max = Math.ceil(max);
             int x = max.intValue();
             if(res <= x)
                 res = x;
         }
         return res;
    }
}
