package linkedList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 */
public class delete {
    public ListNode deleteDuplication(ListNode pHead)
    {
    	if(pHead==null||pHead.next==null) return pHead;
    	if(pHead.val==pHead.next.val){
    		ListNode node = pHead.next;
    		while(node!=null&&node.val==pHead.val){
    			node = node.next;
    		}
    		return deleteDuplication(node);
    	}else{
    		pHead.next = deleteDuplication(pHead.next);
    		return pHead;
    	}

    }
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
