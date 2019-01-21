package delete_colums_to_make_sorted;

import org.junit.Assert;
import org.junit.Test;

public class Soltest {
    @Test
    public void minDeletionSizeTest(){
        Solution solution = new Solution();

        String [] inputs = {"acb","dcb","abc", "xzt"};

        Assert.assertEquals(2, solution.minDeletionSize(inputs));

    }
}
