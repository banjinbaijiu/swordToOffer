package number;

import java.util.Stack;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class minimumStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.size()<1||stack2.peek()>node){
            stack2.push(node);
        }else{
            stack2.push(stack2.peek());
        }
    }
    
    public void pop() {
        if(stack1.size()<1||stack2.size()<1){
            throw new RuntimeException("栈为空");
        }
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}
