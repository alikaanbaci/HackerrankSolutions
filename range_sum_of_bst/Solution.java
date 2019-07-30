package range_sum_of_bst;

class Solution {
    int sum = 0;
    private void traverse(TreeNode root, int L, int R){
        if(root != null){
            if(root.val >= L){
                traverse(root.left, L, R);
            }
            if(root.val >= L && root.val <= R){
                sum += root.val;
            }
            if(root.val <= R){
                traverse(root.right, L, R);
            }
        }
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        traverse(root, L, R);
        return sum;
    }
}
