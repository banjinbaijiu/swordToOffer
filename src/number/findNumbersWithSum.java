package number;

import java.util.ArrayList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S��
 * ����������ĳ˻���С�ġ�
 * �������:
 * ��Ӧÿ�����԰����������������С���������
 */
public class findNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(array==null||array.length<=0) return arr;
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                arr.add(array[i]);
                arr.add(array[j]);
                break;
            }else if(array[i]+array[j]<sum){
                i++;
            }else{
                j--;
            }
        }
        return arr;
    }
}
