package sherlock_and_array;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolTest {
    List<Integer> inputs;

    @Test
    public void balancedSumsTestCase1(){
        inputs = new ArrayList<>();
        Solution solution = new Solution();
        Collections.addAll(inputs, 1, 1, 4, 1, 1);
        Assert.assertEquals("YES", solution.balancedSums(inputs));
    }

    @Test
    public void balancedSumsTestCase2(){
        inputs = new ArrayList<>();
        Solution solution = new Solution();
        Collections.addAll(inputs, 0, 0, 2, 0);
        Assert.assertEquals("YES", solution.balancedSums(inputs));
    }
    @Test
    public void balancedSumsTestCase3(){
        inputs = new ArrayList<>();
        Solution solution = new Solution();
        Collections.addAll(inputs, 2, 0, 0, 0);
        Assert.assertEquals("YES", solution.balancedSums(inputs));
    }
    @Test
    public void balancedSumsTestCase4(){
        inputs = new ArrayList<>();
        Solution solution = new Solution();
        Collections.addAll(inputs, 1, 2, 4);
        Assert.assertEquals("NO", solution.balancedSums(inputs));
    }
}
