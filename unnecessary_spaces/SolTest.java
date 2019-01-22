package unnecessary_spaces;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test
    public void removeSpacesTest(){
        Solution solution = new Solution();

        String input = "hello   is   there anybody in    there..!";

        Assert.assertEquals("hello is there anybody in there..!", solution.removeSpaces(input));
    }
}
