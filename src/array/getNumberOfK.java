package array;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 统计一个数字在排序数组中出现的次数。
 */
public class getNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i=0;i<array.length;i++){
        	if(array[i]==k){
        		count++;
        	}
        	if(array[i]>k){
        		break;
        	}
        }
        return count;
    }
}
