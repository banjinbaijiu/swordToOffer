package binaryTree;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 */
public class squenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence==null||sequence.length==0) return false;
    	if(sequence.length==1) return true;
    	return helper(sequence,0,sequence.length-1);        
    }

	private boolean helper(int[] sequence, int start, int end) {
		if(start>=end) return true;
		int i = end;
		while(i>start&&sequence[i-1]>sequence[end]){
			i--;
		}
		for(int j=start;j<i;j++){
			if(sequence[j]>sequence[end]){
				return false;
			}
		}
		return helper(sequence, start, i-1)&&helper(sequence, i, end-1);
	}
}
