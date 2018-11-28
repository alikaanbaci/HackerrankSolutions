package conntected_cell_in_a_grid;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    int [][] testArray1 = new int[][]{
            { 1, 1, 1, 0, 1 },
            { 0, 0, 1, 0, 0 },
            { 1, 1, 0, 1, 0 },
            { 0, 1, 1, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0 },
            { 0, 0, 1, 1, 0 }};
    @Test
    public void connnecttedCellTest(){
        Solution solution = new Solution();
        Assert.assertEquals(9, solution.connectedCell(testArray1));
    }
}
