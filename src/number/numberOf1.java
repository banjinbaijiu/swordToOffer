package number;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class numberOf1 {
    public int NumberOf1(int n) {
    	int count = 0;
    	while(n!=0){
    		n = n&(n-1);
    		count++;
    	}
    	return count;

    }
}
