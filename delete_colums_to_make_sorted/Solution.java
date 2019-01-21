package delete_colums_to_make_sorted;

class Solution {
    public int minDeletionSize(String[] A) {
        int l = A[0].length();
        int n = A.length;

        for(int i = 0; i<l; i++){
            for(int j = 0; j<n-1; j++){

                char c1 = A[j].charAt(i);
                char c2 = A[j+1].charAt(i);

                if(c1 > c2){
                    break;
                }

                if(j == n-2){
                    return i;
                }
            }
        }
        return n;
    }
}