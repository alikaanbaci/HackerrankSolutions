package migratory_birds;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private Object getKeyFromValue(Map map, Object value){
        for (Object key : map.keySet()){
            if(map.get(key).equals(value)){
                return key;
            }
        }
        return null;
    }

    public int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdsMap = new HashMap<>();

        for (Integer element : arr){
            if(birdsMap.get(element) == null){
                birdsMap.put(element, 1);
            }
            else {
                int value = birdsMap.get(element);
                birdsMap.put(element, ++value);
            }
        }
        int result = Collections.max(birdsMap.values());
        return (Integer) getKeyFromValue(birdsMap, result);
    }
}
