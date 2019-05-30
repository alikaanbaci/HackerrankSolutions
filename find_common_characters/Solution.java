package find_common_characters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] A) {
        int a = 'a';
        int [] common = new int[26];
        int [] freq = new int[26];
        List<String> commonChars = new ArrayList<>();

        for (int i = 0; i < A[0].length(); i++){
            common[A[0].charAt(i) - a]++;
        }


        for (int i = 1; i < A.length; i++){
            for (int j = 0; j < A[i].length(); j++){
                freq[A[i].charAt(j) - a]++;
            }

            for (int j = 0; j < 26; j++){
                common[j] = Math.min(common[j], freq[j]);
                freq[j] = 0;
            }
        }

        for (int i = 0; i < 26; i++){
            while (common[i] > 0){
                commonChars.add(Character.valueOf((char) (i+a)).toString());
                common[i]--;
            }
        }
        return commonChars;
    }
}
