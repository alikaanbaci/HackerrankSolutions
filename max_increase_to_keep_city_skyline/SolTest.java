package max_increase_to_keep_city_skyline;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    Solution solution = new Solution();

    @Test
    public void maxIncreaseKeepingSkylineTest(){
        int [][] city = { {3, 0, 8, 4},
                          {2, 4, 5, 7},
                          {9, 2, 6, 3},
                          {0, 3, 1, 0} };
        Assert.assertEquals(35, solution.maxIncreaseKeepingSkyline(city));

    }
}
