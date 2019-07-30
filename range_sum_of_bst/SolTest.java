package range_sum_of_bst;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolTest {
    TreeNode root;
    Solution solution = new Solution();

    TreeNode insertRec(TreeNode root, int key) {

        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val)
            root.left = insertRec(root.left, key);
        else if (key > root.val)
            root.right = insertRec(root.right, key);

        return root;
    }

    @Before
    public void setUp(){
        root = insertRec(root,10);
        root = insertRec(root, 5);
        root = insertRec(root, 15);
        root = insertRec(root, 3);
        root = insertRec(root, 7);
    }

    @Test
    public void rangeSumBSTTest(){
        Assert.assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }
}
