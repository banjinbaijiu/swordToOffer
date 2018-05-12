package linkedList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class findKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null||k<=0) return null;
    	ListNode pre = head;
    	for(int i =1;i<k;i++){
    		if(pre.next!=null){
    			pre = pre.next;
    		}else{
    			return null;
    		}
    	}
    	while(pre.next!=null){
    		head = head.next;
    		pre = pre.next;
    	}
    	return head;
    }	
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
