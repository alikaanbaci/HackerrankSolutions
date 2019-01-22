package unnecessary_spaces;

public class Solution {
    public String removeSpaces(String string){
        int space = 0;
        String copy = new String();
        for (int i = 0; i<string.length(); i++){
            if(string.charAt(i) == ' '){
                space++;
                continue;
            }
            if (space > 0){
                copy += ' ';
                space = 0;
            }
            copy += string.charAt(i);
        }
        return copy;
    }
}
