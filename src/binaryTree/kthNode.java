package binaryTree;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
 * ���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
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
