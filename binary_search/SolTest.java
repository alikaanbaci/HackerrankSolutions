package binary_search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolTest {
    Solution solution;
    int target;
    int  [] nums = {1, 3, 5, 6, 7, 8, 10, 16, 19};

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void searchIndexTest(){
        target = 9;
        Assert.assertEquals(6, solution.searchInsert(nums, target));
    }
}
