package sherlock_anagrams;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void toplaTest(){
        Assert.assertEquals(4,solution.sherlockAndAnagrams("abba"));
        Assert.assertEquals(0,solution.sherlockAndAnagrams("abcd"));
        Assert.assertEquals(3,solution.sherlockAndAnagrams("ifailuhkqq"));
        Assert.assertEquals(10,solution.sherlockAndAnagrams("kkkk"));
    }
}
