package assignment;

public class Solution {
    int sum  = 0;
    int maxdeep = 0;

    public int deepestLeavesSum(TreeNode root) {
        int curr = 1;
        maxdeep = maxDepth(root);
        sumofleaves(root, curr);
        return sum;
    }

    public void sumofleaves(TreeNode node, int curr) {
        if(node != null) {
            if(curr == maxdeep) sum+=node.val;
            sumofleaves(node.left, curr+1);
            sumofleaves(node.right, curr+1);
        }
    }

    public int maxDepth(TreeNode node)
    {
        if (node == null) return 0;
        else
        {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            if (leftDepth > rightDepth) return (leftDepth + 1);
            else return (rightDepth + 1);
        }
    }
}
