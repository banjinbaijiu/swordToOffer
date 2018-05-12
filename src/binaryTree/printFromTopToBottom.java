package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class printFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
		if(root==null) return arr;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while(!q.isEmpty()){
			TreeNode t = q.poll();
			arr.add(t.val);
			if(t.left!=null){
				q.offer(t.left);
			}
			if(t.right!=null){
				q.offer(t.right);
			}
		}
		return arr;	
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
