package jesse_and_cookies;

import java.util.PriorityQueue;

public class Solution {
    int cookies(int k, int[] A) {

        PriorityQueue<Integer> cookies = new PriorityQueue();

        Integer first, second;
        Integer ops = 0;

        for(int a : A){
            cookies.add(a);
        }

        while(cookies.peek() < k){
            first = cookies.poll();
            second = cookies.poll();

            cookies.add(first*1 + second*2);

            ops++;
            if(cookies.size() <= 1 && cookies.peek() < k) return -1;
        }

        return ops;
    }
}
