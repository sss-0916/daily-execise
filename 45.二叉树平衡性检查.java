import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Balance {
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        int left = height(root.left) + 1;
        int right = height(root.right) + 1;
        
        return left > right ? left : right;
    }
    
    public boolean isBalance(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (root.left == null && root.right == null) {
            return true;
        }
        
        int left = height(root.left);
        int right = height(root.right);
        if (left - right > 1 || right - left > 1) {
            return false;
        }
        return true;
    }
}