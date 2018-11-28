package sherlock_anagrams;


import java.util.Arrays;

public class Solution {
    private boolean anagram_test(String s1, String s2){
        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    // O(n^3)
    public int sherlockAndAnagrams(String s) {
        String s1 = null, s2 = null;
        int anagram = 0;
        boolean isFirst;
        int length = s.length();
        for (int k = 1; k<=length; k++){
            for (int l = 0; l<length; l++){
                isFirst = true;
                for(int i = l, j = k+l; i<length && j<=length; i++, j++) {
                    if(isFirst) {
                        s1 = s.substring(i,j);
                        isFirst = false;
                        continue;
                    }
                    s2 = s.substring(i,j);
                    if(anagram_test(s1,s2))
                        anagram++;
                }
            }
        }
        return anagram;
    }
}
