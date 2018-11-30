package larrys_array;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    int [] inputs = new int[]{1,6,5,2,4,3};
    int [] inputs2 = new int[]{1,2,3,5,4};
    int [] inputs3 = new int[]{9, 6, 8, 12, 3, 7, 1, 11, 10, 2, 5, 4};
    int [] inputs4 = new int[]{7, 9, 15, 8, 10, 16, 6, 14, 5, 13, 17, 12, 3, 11, 4, 1, 18, 2};
    int [] inputs5 = new int[]{17, 21, 2, 1, 16, 9, 12, 11, 6, 18, 20, 7, 14, 8, 19, 10, 3, 4, 13, 5, 15};
    @Test
    public void larrysArrayTest(){
        Solution solution = new Solution();
//        Assert.assertEquals("YES", solution.larrysArray(inputs));
//        Assert.assertEquals("NO", solution.larrysArray(inputs2));
//        Assert.assertEquals("NO", solution.larrysArray(inputs3));
//        Assert.assertEquals("NO", solution.larrysArray(inputs4));
        Assert.assertEquals("YES", solution.larrysArray(inputs5));
    }
}
