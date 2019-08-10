package maximum_binary_tree;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private int findMax(int [] nums, int start, int end){

        int max = start;

        for(int i = start+1; i <= end; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }

    private TreeNode recurr(int [] nums, int start, int end){

        if((end - start) < 0){
            return null;
        }

        if(end-start == 0){
            return new TreeNode(nums[end]);
        }

        int max = findMax(nums, start, end);

        TreeNode node = new TreeNode(nums[max]);

        // Left part of the array
        node.left = recurr(nums, start, max-1);
        // Right part of the array
        node.right = recurr(nums, max+1, end);

        return node;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return recurr(nums, 0, nums.length-1);
    }
}