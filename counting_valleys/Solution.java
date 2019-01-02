package counting_valleys;

public class Solution {
    public int countingValleys(String s) {
        int prev = 0, count = 0, position = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'U')
                position++;
            else
                position--;
            if(prev == 0 && position == -1)
                count++;
            prev = position;
        }
        return count;

    }
}
