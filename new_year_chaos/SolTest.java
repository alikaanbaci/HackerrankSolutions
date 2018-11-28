package new_year_chaos;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test(timeout = 10)
    public void tester(){
        Solution test = new Solution();
        int [] input = {2, 1, 5, 3, 4,};
        int [] input2 = {2, 5, 1, 3, 4};
        Assert.assertEquals(3, test.minimumBribes(input));
        Assert.assertEquals(-1, test.minimumBribes(input2));
    }
}
