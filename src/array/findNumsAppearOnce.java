package array;

import java.util.ArrayList;

/**
 * 
 * @author �¿�
 * ��Ŀ����
 * һ�����������������������֮�⣬���������ֶ����������Ρ�
 * ��д�����ҳ�������ֻ����һ�ε����֡�
 */
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class findNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<=1||array==null){
        	num1 = null;
        	num2 = null;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
        	if(arr.contains(array[i])){
        		arr.remove(new Integer(array[i]));
        	}else{
        		arr.add(array[i]);
        	}
        }
        if(arr.size()==2){
        	num1[0] = arr.get(0);
        	num2[0] = arr.get(1);
        }
    }
}
