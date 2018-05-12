package binaryTree;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class symmetrical {
	   boolean isSymmetrical(TreeNode pRoot){
			 if(pRoot==null){
				 return true;
			 }
			 return helper(pRoot.left,pRoot.right);
		 }
		 private boolean helper(TreeNode p1, TreeNode p2) {
			if(p1==null&&p2==null) return true;
			if(p1!=null&&p2!=null){
				return p1.val==p2.val&&helper(p1.left, p2.right)&&helper(p1.right, p2.left);
			}
			return false;
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
