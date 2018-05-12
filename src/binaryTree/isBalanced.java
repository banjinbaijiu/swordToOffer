package binaryTree;

/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class isBalanced {
	  boolean balanced = true;
		public boolean IsBalanced_Solution(TreeNode root){
			helper(root);
			return balanced;
		}
		
		
		
		private int helper(TreeNode root) {
			if(root==null) return 0;
			int left = helper(root.left);
			int right = helper(root.right);
			if(Math.abs(left-right)>1){
				balanced= false;
			}
			return left>right?left+1:right+1;
		}
		public class TreeNode {
	        int val = 0;
	        TreeNode left = null;
	        TreeNode right = null;

	        public TreeNode(int val) {
	            this.val = val;

	        }
		}
}
