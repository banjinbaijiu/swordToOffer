package binaryTree;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 给定一颗二叉搜索树，请找出其中的第k大的结点。
 * 例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */
public class kthNode {
    int index=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
    	if(pRoot!=null){
    		TreeNode t = KthNode(pRoot.left, k);
    		if(t!=null){
    			return t;
    		}
    		index++;
    		if(index==k){
    			return pRoot;
    		}
    		t = KthNode(pRoot.right, k);
    		if(t!=null){
    			return t;
    		}
    	}
        return null;
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
