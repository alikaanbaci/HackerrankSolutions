package contenst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolTest {

    Solution solution;
    List<Integer> wallPoints;
    List<Integer> lengths;

    @Before
    public void setUp(){
        solution = new Solution();
        wallPoints = new ArrayList<>();
        lengths = new ArrayList<>();
    }

    @Test
    public void solveTest(){
        Collections.addAll(wallPoints, 15, 11, 17);
        Collections.addAll(lengths, 5,1,2);
        Assert.assertEquals(12, solution.solve(5, wallPoints, lengths));
    }

    @Test
    public void solveTest1(){
        Collections.addAll(wallPoints,5,5);
        Collections.addAll(lengths, 4,4);
        Assert.assertEquals(0, solution.solve(5, wallPoints, lengths));
    }

    @Test
    public void solveTest2(){
        Collections.addAll(wallPoints, 157, 140, 44, 83, 108, 63, 137, 40, 121, 106);
        Collections.addAll(lengths, 24, 30, 17, 37, 12, 34, 25, 22, 35, 30);
        Assert.assertEquals(124, solution.solve(27, wallPoints, lengths));
    }
}
