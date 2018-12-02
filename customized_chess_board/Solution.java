package customized_chess_board;

import java.util.List;

public class Solution {
    String solve(List<List<Integer>> board) {
        int x = board.size();
        int y = board.get(0).size();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if(!board.get(i).get(j).equals(board.get(i).get(j+1)))
                    return "NO";
                if(!board.get(i).get(j).equals(board.get(i+1).get(j)))
                    return "NO";
            }
        }
        return "YES";
    }

}
