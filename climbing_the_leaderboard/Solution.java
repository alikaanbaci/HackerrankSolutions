package climbing_the_leaderboard;


import java.util.*;

public class Solution {
    public Integer[] climbingLeaderboard(Integer[] scores, Integer[] alice) {
        Integer[] unique = Arrays.stream(scores).distinct().toArray(Integer[]::new);
        List<Integer> result = new ArrayList<>();
        int length = unique.length-1;
        for(Integer score : alice){
            while (length>=0){
                if(score >= unique[length]) length--;
                else {
                    result.add(length+2);
                    break;
                }
            }
            if(length<0) result.add(1);
        }
        return result.toArray(new Integer[0]);
    }
}

