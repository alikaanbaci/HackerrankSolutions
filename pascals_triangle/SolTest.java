package pascals_triangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolTest {
    public List<List<Integer>> triangle = new ArrayList<List<Integer>>();

    @Before
    public void setUp(){
        List<Integer> firstRow = Arrays.asList(1);
        List<Integer> secondRow = Arrays.asList(1, 1);
        List<Integer> thirdRow = Arrays.asList(1, 2, 1);
        List<Integer> fourthRow = Arrays.asList(1, 3, 3, 1);
        List<Integer> fifthRow = Arrays.asList(1, 4, 6, 4, 1);
        triangle.add(firstRow);
        triangle.add(secondRow);
        triangle.add(thirdRow);
        triangle.add(fourthRow);
        triangle.add(fifthRow);
    }

    @Test
    public void generateTriangleTest(){
        Solution solution = new Solution();
        Assert.assertEquals(triangle.toString(), solution.generate(5).toString());
    }
}
