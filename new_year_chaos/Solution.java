package new_year_chaos;

import java.util.*;

public class Solution {

    // Complete the minimumBribes function below.
    public int minimumBribes(int[] q) {
        int length = q.length;
        int bribe = 0;
        boolean isOk;
        for(int i = --length; i >= 0; i--){
            if(q[i] != i+1){
                isOk = false;
                for(int j = 1; j < 3; j++){
                    if(i<j) break;
                    if(q[i-j] == i+1){
                        isOk = true;
                        int tmp = q[i-j];
                        for (int k = 0; k < j; k++){
                            bribe++;
                            q[i-j+k] = q[i-j+k+1];
                        }
                        q[i] = tmp;
                    }
                }
                if(!isOk){
                    return -1;
                }
            }
        }
        return bribe;
    }
}

