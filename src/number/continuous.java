package number;

import java.util.Arrays;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 * �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����
 * LL����ȥ��������Ʊ���� ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��
 */
public class continuous {
    public boolean isContinuous(int [] numbers) {
    	if(numbers.length!=5||numbers==null) return false;
    	int intero  = 0;
    	int count = 0;
    	Arrays.sort(numbers);
    	for(int i=0;i<numbers.length-1;i++){
    		if(numbers[i] == 0){
    			count++;
    		}else if(numbers[i]==numbers[i+1]){
    			return false;
    		}else{
    			intero += numbers[i+1]-numbers[i]-1;
    		}
    	}
    	if(count>=intero){
    		return true;
    	}else{
        	return false;
    	}
    }
}
