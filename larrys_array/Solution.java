package larrys_array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Solution {
    private int [] A;
    private boolean lookForIndex(int index, int value) {
        for (int i = index; i < index+3; i++){
            if(A[i] == value)
                return true;
        }
        return false;
    }
    private void rotate(int index, int value){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(A[index]);
        queue.add(A[index+1]);
        queue.add(A[index+2]);
        for (int i = index; i<index+3; i++){
            if (value == queue.peek()){
                break;
            }
            else {
                int tmp = queue.pollFirst();
                queue.add(tmp);
            }
        }
        for (int i = index; i<index+3; i++){
            A[i] = queue.poll();
        }
    }
    public String larrysArray(int[] A) {
        this.A = A;
        int n = A.length;
        int backMove = 0;
        int look = 0;
        for (int i = 0; i < n-2; i++){
            if(A[i] != i+1){
                look = i+1;
                look -= backMove;
                if(lookForIndex(i, look)){
                    rotate(i, look);
                    i -= backMove+1;
                    backMove = 0;
                }
                else {
                    backMove++;
                }
            }
        }
        int [] tmp = Arrays.copyOf(A,n);
        //Arrays.sort(A);
        for (int i = 0; i < n; i++){
            if(tmp[i] != A[i]) return "NO";
        }
        return "YES";
    }

}
