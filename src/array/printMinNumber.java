package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */
public class printMinNumber {
    public String PrintMinNumber(int [] numbers) {
    	String str = "";
    	for(int i=0;i<numbers.length-1;i++){
    		for(int j=i+1;j<numbers.length;j++){
    			int a = Integer.parseInt(numbers[i]+""+numbers[j]);
    			int b = Integer.parseInt(numbers[j]+""+numbers[i]);
    			if(a>b){
    				int temp = numbers[i];
    				numbers[i] = numbers[j];
    				numbers[j] = temp;
    			}
    		}
    	}
    	for(int i=0;i<numbers.length;i++){
    		str += String.valueOf(numbers[i]);
    	}
    	return str;
    }
}
