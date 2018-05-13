package number;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
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
