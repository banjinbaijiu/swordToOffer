package number;

import java.util.Stack;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 */
public class isPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<Integer>();
        if(pushA.length==0||popA.length==0) return false;
        int index = 0;
        for(int i = 0;i<pushA.length;i++){
            s.push(pushA[i]);
            while(!s.isEmpty()&&s.peek()==popA[index]){
                s.pop();
                index++;
            }
        }
        return s.isEmpty();
    }
}
