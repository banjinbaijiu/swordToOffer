package number;

import java.util.ArrayList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
 * ���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
 * �������:
 * ������к�ΪS�������������С�
 * �����ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 */
public class findContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer>>();
    	for(int i=1;i<=(sum+1)/2;i++){
    		ArrayList<Integer> list = new ArrayList<Integer>();
    		int temp = i;
    		int tsum = i;
    		list.add(temp);
    		while(tsum<sum){
    			temp = temp+1;
    			list.add(temp);
    			tsum += temp;
    			if(tsum==sum&&list.size()>1){
    				arr.add(list);
    				break;
    			}
    		}
    	}
    	return arr;
    }
}
