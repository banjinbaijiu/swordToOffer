package number;

import java.util.ArrayList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class uglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        int num2 = 0,num3 = 0,num5 = 0,num;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        for(int i=1;i<index;i++){
        	num2 = 2*arr.get(t2);
        	num3 = 3*arr.get(t3);
        	num5 = 5*arr.get(t5);
        	num = Math.min(num2, Math.min(num3, num5));
        	if(num == num2){
        		t2++;
        	}
        	if(num == num3){
        		t3++;
        	}
        	if(num == num5){
        		t5++;
        	}
        	arr.add(num);
        }
        return arr.get(index-1);
    }
}
