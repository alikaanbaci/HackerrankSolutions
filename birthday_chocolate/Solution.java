package birthday_chocolate;

import java.util.List;

public class Solution {
    int birthday(List<Integer> s, int d, int m) {
        int sum = d, len = m;
        int size = s.size();
        int total = 0, ok = 0;
        for(int i = 0; i < size-len; i++){
            for(int j = i; j <= i + len; j++){
                total += s.get(j);
            }
            if(sum == total)
                ok++;
            total = 0;
        }
        return ok;
    }

}
