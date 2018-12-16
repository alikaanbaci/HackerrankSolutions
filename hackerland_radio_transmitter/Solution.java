package hackerland_radio_transmitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int hackerlandRadioTransmitters(int[] x, int k) {
        Arrays.sort(x);
        int length = x.length;
        int position = 0;
        int transmitter = 0;
        List<Integer> houses = new ArrayList<>();
        houses.add(x[0]);
        for (int i = 1; i < length; i++){
           if (i == position) continue;
           if(x[position] + 2*k+1 > x[i]){
               houses.add(x[i]);
           }
           else if (houses.contains(houses.get(0)+k) || houses.size() <= k){
               transmitter++;
               position = i;
               houses.clear();
               houses.add(x[position]);
           }
           else if(x[i] - houses.get(houses.size()-1) <= k){
               continue;
           }
           else{
               transmitter+=2;
               position = i;
               //i = position;
               houses.clear();
               if(i+k >= length) break;  
               houses.add(x[position]);
           }
        }
        if(houses.size() > 0) transmitter++;
        return transmitter;
    }
}
