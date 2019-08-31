package reverse_sentence;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {

    @Test
    public void reverseTest(){
        Solution solution = new Solution();

        Assert.assertEquals("sentence test a is this", solution.reverseWords("this is a test sentence"));
    }
}
