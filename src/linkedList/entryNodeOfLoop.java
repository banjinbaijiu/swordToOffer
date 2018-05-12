package linkedList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
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
