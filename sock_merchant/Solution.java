package sock_merchant;

import java.util.*;

public class Solution {
    int sockMerchant(int n, int[] ar) {
        Set<Integer> searching = new HashSet<>();
        searching.add(ar[0]);
        int count = 0;
        for(int i = 1; i < n; i++){
            if(searching.contains(ar[i])){
                count++;
                searching.remove(ar[i]);
            }
            else{
                searching.add(ar[i]);
            }
        }
        return count;
    }
}
