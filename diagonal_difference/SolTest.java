package diagonal_difference;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test
    public void diagonalDiffrenceTest(){
        Solution solution = new Solution();
        int [][] arr = new int[][] {{1, 0, 0},
                                    {1, 1, 0},
                                    {1, 0, 1},};
        Assert.assertEquals(1, solution.diagonalDifference(arr));
    }
}
