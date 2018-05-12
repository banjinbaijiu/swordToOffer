package binaryTree;

import java.util.ArrayList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class findPath {
	ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) return arr;
        list.add(root.val);
        target -= root.val;
        if(target==0&&root.left==null&&root.right==null){
        	arr.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
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
