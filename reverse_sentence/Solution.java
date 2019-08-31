package reverse_sentence;

public class Solution {
    public String reverseWords(String sentence) {
        int start, end = sentence.length() + 1;
        String result = "";

        for (int i = sentence.length() - 1; i >= 0; i--){

            if(sentence.charAt(i) == ' '){
                start = i + 1;
                result += sentence.substring(start, end - 1) + " ";
                end = start;
            }
        }
        return result.substring(0, result.length()) + sentence.substring(0, end - 1);
    }

}

