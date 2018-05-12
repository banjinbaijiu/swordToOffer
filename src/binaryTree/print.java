package binaryTree;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class print {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer> >();
    	if(pRoot==null) return arr;
    	Stack<TreeNode> s1 = new Stack<TreeNode>();
    	Stack<TreeNode> s2 = new Stack<TreeNode>();
    	s1.push(pRoot);
    	while(!s1.isEmpty()||!s2.isEmpty()){
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		if(!s1.isEmpty()){
    			while(!s1.isEmpty()){
    				TreeNode t = s1.pop();
    				list.add(t.val);
    				if(t.left!=null){
    					s2.push(t.left);
    				}
    				if(t.right!=null){
    					s2.push(t.right);
    				}
    			}
    		}else{
    			while(!s2.isEmpty()){
    				TreeNode t = s2.pop();
    				list.add(t.val);
    				if(t.right!=null){
    					s1.push(t.right);
    				}
    				if(t.left!=null){
    					s1.push(t.left);
    				}
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
