package find_common_characters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolTest {
    String [] case1;
    String [] case2;

    List<String> result1 = new ArrayList<>();
    List<String> result2 = new ArrayList<>();

    Solution solution = new Solution();

    @Before
    public void setUp(){
        case1 = new String[]{"bella", "label", "roller"};
        case2 = new String[]{"cool", "lock", "cook"};

        result1 = Arrays.asList("e", "l", "l");
        result2 = Arrays.asList("c", "o");
    }

    @Test
    public void commonCharsTest(){
        Assert.assertEquals(result1, solution.commonChars(case1));
        Assert.assertNotSame(result1, solution.commonChars(case1));

        Assert.assertEquals(result2, solution.commonChars(case2));
        Assert.assertNotSame(result2, solution.commonChars(case2));
    }
}
