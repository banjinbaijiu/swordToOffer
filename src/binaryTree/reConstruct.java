package binaryTree;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class reConstruct {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode t = helper(pre,0,pre.length-1,in,0,in.length-1);
		return t;
    }
	private TreeNode helper(int[] pre, int startpre, int endpre, int[] in, int startin, int endin) {
		if(startpre>endpre||startin>endin) return null;
		TreeNode treeNode = new TreeNode(pre[startpre]);
		for(int i=startin;i<=endin;i++){
			if(in[i]==pre[startpre]){
				treeNode.left = helper(pre,startpre+1,startpre+i-startin,in,startin,i-1);
				treeNode.right = helper(pre,startpre+i-startin+1,endpre,in,i+1,endin);
			}
		}
		return treeNode;
	}
	 
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
}
