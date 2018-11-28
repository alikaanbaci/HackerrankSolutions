package orginizing_containers_of_balls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // Complete the organizingContainers function below.
    static String organizingContainers(int[][] container) {

        int n = container.length;
        int outside = 0;
        int inside = 0;
        boolean isPossible = true;

        List<Integer> outsideMap = new ArrayList<>();
        List<Integer> insideMap = new ArrayList<>();

        for (int i = 0; i < n; i++){
            inside = 0;
            outside = 0;
            for (int j = 0; j < n; j++){
                inside += container[i][j];
                outside += container[j][i];
            }
            insideMap.add(inside);
            outsideMap.add(outside);
        }

        insideMap.removeAll(outsideMap);
        if (!insideMap.isEmpty()) isPossible=false;
        if (isPossible) return "Possible";
        return "Impossible";
    }
}
