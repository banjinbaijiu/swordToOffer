package number;

import java.util.ArrayList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��ֻ��������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ����������7�� 
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class uglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        int num2 = 0,num3 = 0,num5 = 0,num;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        for(int i=1;i<index;i++){
        	num2 = 2*arr.get(t2);
        	num3 = 3*arr.get(t3);
        	num5 = 5*arr.get(t5);
        	num = Math.min(num2, Math.min(num3, num5));
        	if(num == num2){
        		t2++;
        	}
        	if(num == num3){
        		t3++;
        	}
        	if(num == num5){
        		t5++;
        	}
        	arr.add(num);
        }
        return arr.get(index-1);
    }
}
