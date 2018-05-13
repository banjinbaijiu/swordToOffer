package array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class getLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	if(input.length<k||k<=0) return arr;
    	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
    		public int compare(Integer o1, Integer o2) {
    			return o2.compareTo(o1);
    		};
		});
    	for(int i=0;i<input.length;i++){
    		if(maxHeap.size()!=k){
    			maxHeap.add(input[i]);
    		}else if(maxHeap.peek()>input[i]){
    			Integer temp = maxHeap.poll();
    			temp = null;
    			maxHeap.add(input[i]);
    		}
    	}
    	for(Integer integer:maxHeap){
    		arr.add(integer);
    	}
    	return arr;
    }
}
