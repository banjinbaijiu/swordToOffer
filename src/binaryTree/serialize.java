package binaryTree;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 */
public class serialize {
	int index=-1;
    String Serialize(TreeNode root) {
    	StringBuffer sb = new StringBuffer();
    	if(root==null){
    		sb.append("#,");
    		return sb.toString();
    	}
    	sb.append(root.val+",");
    	sb.append(Serialize(root.left));
    	sb.append(Serialize(root.right));
    	return sb.toString();
    }
    TreeNode Deserialize(String str) {
       index++;
       if(index>str.length()){
    	   return null;
       }
       String[] strr = str.split(",");
       TreeNode node = null;
       if(!strr[index].equals("#")){
    	   node = new TreeNode(Integer.parseInt(strr[index]));
    	   node.left = Deserialize(str);
    	   node.right = Deserialize(str);
       }
       return node;
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
