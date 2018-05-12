package linkedList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */
public class entryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(slow.next!=null&&fast.next!=null){
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow==fast){
        		slow = pHead;
        		while(slow!=fast){
        			slow = slow.next;
        			fast = fast.next;
        		}
        		return slow;
        	}
        }
        return null;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
