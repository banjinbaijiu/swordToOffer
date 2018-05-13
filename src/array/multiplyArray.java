package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�����
 */
public class multiplyArray {
    public int[] multiply(int[] A) {
    	int len = A.length;
    	int[] B = new int[len];
    	if(len!=0){
    		B[0] = 1;
    		for(int i=1;i<len;i++){
    			B[i] = B[i-1]*A[i-1];
    		}
    		int temp = 1;
    		for(int i = len-2;i>=0;i--){
    			temp = temp*A[i+1];
    			B[i] = B[i]*temp;
    		}
    	}
    	return B;
    }
}
