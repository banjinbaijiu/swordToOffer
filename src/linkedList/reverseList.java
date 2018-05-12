package linkedList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ��������ת�����������������Ԫ�ء�
 */
public class reverseList {
    public ListNode ReverseList(ListNode head) {
    	if(head==null) return head;
    	ListNode pre = null;
    	ListNode next = null;
    	while(head!=null){
    		next = head.next;
    		head.next = pre;
    		pre = head;
    		head = next;
    	}
    	return pre;
    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
