package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */
public class reOrder {
    public void reOrderArray(int [] array) {
        if(array.length<=0) return;  //����һ��ϰ����д������ʾ���������������дҲû��ϵ���������д�ڷ������м���������Ļ����������������Ͳ���ִ���ˡ�
        int oddBegin = 0;
        int oddCount = 0;
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
        	if(array[i]%2==1){
        		oddCount++;
        	}
        }
        for(int i=0;i<array.length;i++){
        	if(array[i]%2==1){
        		newArray[oddBegin++] = array[i];
        	}else{
        		newArray[oddCount++] = array[i];
        	}
        }
        for(int i=0;i<array.length;i++){
        	array[i] = newArray[i];
        }
    }
}
