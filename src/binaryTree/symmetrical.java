package binaryTree;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
 * ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
