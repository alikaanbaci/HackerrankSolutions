package birthday_chocolate;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolTest {
    List<Integer> list = new ArrayList<Integer>();
    @Test
    public void birthdayTest(){
        Solution solution = new Solution();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        Assert.assertEquals(2, solution.birthday(list, 3, 2));
    }
}
