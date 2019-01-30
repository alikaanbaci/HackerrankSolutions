package jesse_and_cookies;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test
    public void cookiesTest(){
        Solution solution = new Solution();

        int [] ints = {1, 2, 3, 9, 10, 12};

        Assert.assertEquals(2, solution.cookies(7, ints));
    }
}
