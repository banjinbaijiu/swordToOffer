package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。
 * 每一层输出一行。
 */
public class printrows {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer> >();
		if(pRoot==null){
			return arr;
		}
		LinkedList<TreeNode> lin = new LinkedList<TreeNode>();
		lin.add(pRoot);
		while(!lin.isEmpty()){
			ArrayList<Integer> list = new ArrayList<Integer>();
			int n = lin.size();
			for(int i = 0;i<n;i++){
				TreeNode t = lin.poll();
				list.add(t.val);
				if(t.left!=null){
					lin.add(t.left);
				}
				if(t.right!=null){
					lin.add(t.right);
				}
			}
			arr.add(list);
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
