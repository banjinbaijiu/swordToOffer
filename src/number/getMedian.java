package number;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��εõ�һ���������е���λ����
 * ������������ж�����������ֵ����ô��λ������������ֵ����֮��λ���м����ֵ��
 * ������������ж���ż������ֵ����ô��λ������������ֵ����֮���м���������ƽ��ֵ��
 */
public class getMedian {
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		};
	});
    public void Insert(Integer num) {
        if(minHeap.size()>0&&minHeap.peek()<num){
        	maxHeap.offer(minHeap.poll());
        	minHeap.offer(num);
        }else{
        	maxHeap.offer(num);
        }
        if(maxHeap.size()>minHeap.size()+1){
        	minHeap.offer(maxHeap.poll());
        }
    }

    public Double GetMedian() {
        if(maxHeap.size()==minHeap.size()){
        	return (maxHeap.peek()+minHeap.peek())/2.0;
        }else{
        	return (double)maxHeap.peek();
        }
    }
}
