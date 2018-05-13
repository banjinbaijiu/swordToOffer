package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ��
 * ��������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��᲻�ᱻ������ס��(�������ĳ���������1)
 */
public class findGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<=0||array==null) {
        	return 0;
        }else{
        	int temp = array[0];
        	int max = array[0];
        	for(int i=1;i<array.length;i++){
        		temp = Math.max(temp+array[i], array[i]);
        		max = Math.max(max, temp);
        	}
        	return max;
        }       
    }
}
