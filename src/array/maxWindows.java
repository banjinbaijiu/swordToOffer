package array;

import java.util.ArrayList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
 * {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}��
 * {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */
public class maxWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	if(num==null|num.length<size||size<=0){
    		return arr;
    	}
    	for(int i=0;i<=num.length-size;i++){
    		int temp = num[i];
    		for(int j=i;j<i+size;j++){
    			if(num[j]>temp){
    				temp = num[j];
    			}
    		}
    		arr.add(temp);
    	}
    	return arr;
    }
}
