package save_the_prisoner;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    int [] arr = new int[]{18, 360398845, 1};
    int [] arr2 = new int[]{21, 19, 2};
    @Test
    public void saveThePrisonerTest(){
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.saveThePrisoner(arr));
        Assert.assertEquals(20, solution.saveThePrisoner(arr2));
    }
}
