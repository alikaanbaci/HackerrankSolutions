package migratory_birds;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolTest {

    List<Integer> birds = new ArrayList<>();

    @Test
    public void migratoryBirdsTest(){
        Integer [] birdsArray = new Integer[]{1, 4, 4, 4, 5, 3};
        Collections.addAll(birds, birdsArray);

        Solution solution = new Solution();

        Assert.assertEquals(4, solution.migratoryBirds(birds));
    }
}
