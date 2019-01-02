package counting_valleys;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test
    public void countingValleysTest(){
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.countingValleys("DDDUUUUDUDDDUUU"));
    }
}
