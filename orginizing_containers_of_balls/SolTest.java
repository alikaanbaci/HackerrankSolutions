package orginizing_containers_of_balls;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    private int [][] input0 = new int[][] {{0, 1, 0},
                                            {0, 0, 1},
                                            {1, 0, 0}};
    private int [][] input1 = new int[][] {{0, 2, 1},
                                          {1, 1, 1},
                                          {2, 0, 0}};
    private int [][] input2 = new int[][] {{1, 3, 1},
                                            {2, 1, 2},
                                            {3, 3, 3}};
    private int [][] input4 = new int[][] {{999336263 , 998799923},
                                            {998799923 , 999763019}};
    @Test
    public void organizingContainersTest(){
        Solution solution = new Solution();
        Assert.assertEquals("Possible", solution.organizingContainers(input0));
        Assert.assertEquals("Possible", solution.organizingContainers(input1));
        Assert.assertEquals("Impossible", solution.organizingContainers(input2));
        Assert.assertEquals("Possible", solution.organizingContainers(input4));
    }
}
