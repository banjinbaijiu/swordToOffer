package number;

import java.util.Stack;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
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
