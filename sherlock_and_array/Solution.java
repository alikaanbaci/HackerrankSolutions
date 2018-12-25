package sherlock_and_array;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    //O(n^2)
    public String balancedSumsWithBigOSquare(List<Integer> arr){
        int leftSum, rightSum;
        int length = arr.size();
        for(int i = 0; i < length; i++){
            leftSum = 0;
            rightSum = 0;

            if(i != length-1){
                for (int r = i; r < length-1; r++){
                    rightSum += arr.get(r+1);
                }
            }

            if(i != 0){
                for (int l = i; l>0; l--){
                    leftSum += arr.get(l-1);
                }
            }

            if (leftSum == rightSum) return "YES";
        }
        return "NO";
    }
    // O(n)
    public String balancedSums(List<Integer> arr){
        int length = arr.size();
        int leftSum = 0;
        int rigthSum = 0;
        for (int i = 0; i < length; i++){
            rigthSum += arr.get(i);
        }

        for (int i = 0; i<length; i++){
            rigthSum -= arr.get(i);
            if(leftSum == rigthSum){
                return "YES";
            }
            leftSum += arr.get(i);
        }
        return "NO";
    }
}



















