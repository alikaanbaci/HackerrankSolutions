package sock_merchant;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    @Test
    public void sockMerchantTest(){
        int [] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.sockMerchant(9, ar));
    }
}
