package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2��
 * ��������������0��
 */
//˼·��������з������������֣��������ֵĴ����������������ֳ��ֵĴ����ͻ�Ҫ�ࡣ
//�ڱ�������ʱ��������ֵ��һ��������һ�����֣�һ�Ǵ�����
//������һ������ʱ��������֮ǰ�����������ͬ���������1�����������1��������Ϊ0���򱣴���һ�����֣�����������Ϊ1��
//��������������������ּ�Ϊ����Ȼ�����ж����Ƿ�����������ɡ�
public class moreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 1;
        int result = array[0];
        for(int i=0;i<array.length;i++){
        	if(array[i] == result){
        		count++;
        	}else{
        		count--;
        		if(count==0){
        			count =1;
        			result = array[i];
        		}
        	}
        }
        count = 0;
        for(int i=0;i<array.length;i++){
        	if(array[i] == result){
        		count++;
        	}
        }
        if(count*2>array.length){
        	return result;
        }
        return 0;
    }
}
