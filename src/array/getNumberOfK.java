package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ͳ��һ�����������������г��ֵĴ�����
 */
public class getNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i=0;i<array.length;i++){
        	if(array[i]==k){
        		count++;
        	}
        	if(array[i]>k){
        		break;
        	}
        }
        return count;
    }
}
