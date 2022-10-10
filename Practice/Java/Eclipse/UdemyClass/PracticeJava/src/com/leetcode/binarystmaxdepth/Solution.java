package com.leetcode.binarystmaxdepth;

import com.leetcode.inverttree.TreeNode;

public class Solution {
	static int mDepth;
    static public int maxDepth(TreeNode root) {
        
    	if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = maxDepth(root.left);
            int rheight = maxDepth(root.right);
            mDepth = Math.max(lheight + rheight, mDepth);
            return (Math.max(lheight, rheight) + 1);
        }
            
    }
    
    static public int diameterOfBinaryTree(TreeNode root) {
        mDepth = 0;
        
        maxDepth(root);
        
        return mDepth;
    }

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		//root = TreeNode.constructBST(root, new Integer[] {9,20,null,null,15,7});
		
		TreeNode.printLevelOrder(root);
		
		System.out.println(diameterOfBinaryTree(root));
			
		root = new TreeNode(2);
		root = TreeNode.constructBST(root, new Integer[] {1,2});
		
		TreeNode.printLevelOrder(root);
		
		System.out.println(diameterOfBinaryTree(root));
		
		//[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
		root = new TreeNode(4);
		root = TreeNode.constructBST(root, new Integer[] {-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2});
		
		TreeNode.printLevelOrder(root);
		
		System.out.println(diameterOfBinaryTree(root));
		
	}

}
