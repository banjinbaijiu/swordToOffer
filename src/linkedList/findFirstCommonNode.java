package linkedList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class findFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
   	 if(pHead1==null||pHead2==null) return null;
   	 int length1 = getLength(pHead1);
   	 int length2 = getLength(pHead2);
   	 if(length1>length2){
   		 int le = length1-length2;
   		 for(int i=0;i<le;i++){
   			 pHead1 = pHead1.next;
   		 }
   	 }else{
   		 int le = length2-length1;
   		 for(int i=0;i<le;i++){
   			 pHead2 = pHead2.next;
   		 }
   	 }
   	 while(pHead1!=pHead2){
   		 pHead1 = pHead1.next;
   		 pHead2 = pHead2.next;
   	 }
   	 return pHead1;
   }	
	private int getLength(ListNode pHead) {
		int len = 0;
		while(pHead!=null){
			len++;
			pHead = pHead.next;
		}
		return len;
	}
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}
