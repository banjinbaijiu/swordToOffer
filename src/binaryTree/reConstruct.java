package binaryTree;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
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
