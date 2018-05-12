package linkedList;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class printList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
   	ArrayList<Integer> arr = new ArrayList<Integer>();
   	Stack<Integer> s1 = new Stack<Integer>();
   	while(listNode!=null){
   		s1.add(listNode.val);
   		listNode = listNode.next;
   	}
   	while(!s1.isEmpty()){
   		arr.add(s1.pop());
   	}
   	return arr;
    }
    public class ListNode {
    	int val;
    	ListNode next = null;
    	
    	ListNode(int val) {
    	this.val = val;
    	}
    }
}
