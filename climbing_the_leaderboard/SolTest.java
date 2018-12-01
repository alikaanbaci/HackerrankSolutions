package climbing_the_leaderboard;

import org.junit.Assert;
import org.junit.Test;

public class SolTest {
    Integer [] scores = new Integer[]{100, 90, 90, 80, 75, 60};
    Integer [] alice = new Integer[]{50, 65, 77, 90, 102};
    Integer [] results = new Integer[]{6, 5, 4, 2, 1};

    @Test
    public void climbingLeaderboardTest(){
        Solution solution = new Solution();
        Assert.assertArrayEquals(results,solution.climbingLeaderboard(scores, alice));
    }
}
