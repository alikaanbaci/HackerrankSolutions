package hackerland_radio_transmitter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SolTest {
    int [] x;
    int k;
    Solution solution;

    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void testCase1(){
        x = new int[]{3,5,6,7,8,9,13,14,18,19,21,22,23,24};
        k = 2;
        Assert.assertEquals(4, solution.hackerlandRadioTransmitters(x,k));
    }

    @Test
    public void testCase2(){
        x = new int[]{1,2,3,4,5};
        k = 1;
        Assert.assertEquals(2, solution.hackerlandRadioTransmitters(x, k));
    }

    @Test
    public void testCase3(){
        x = new int[]{3,5,6,7,9,11,12,13,25,26,30};
        k = 2;
        Assert.assertEquals(4, solution.hackerlandRadioTransmitters(x, k));
    }

    @Test
    public void testCase4(){
        x = new int[]{7, 2, 4, 6, 5, 9, 12, 11};
        k = 2;
        Assert.assertEquals(3, solution.hackerlandRadioTransmitters(x,k));
    }

    @Test
    public void testCase5(){
        x = new int[]{3,4,6,7,8,9,10,11,12,30,31,32,33,34};
        k = 2;
        Assert.assertEquals(4, solution.hackerlandRadioTransmitters(x,k));
    }
}
