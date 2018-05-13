package array;

import java.util.ArrayList;

/**
 * 
 * @author 陈奎
 * 题目描述
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class findNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length<=1||array==null){
        	num1 = null;
        	num2 = null;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
        	if(arr.contains(array[i])){
        		arr.remove(new Integer(array[i]));
        	}else{
        		arr.add(array[i]);
        	}
        }
        if(arr.size()==2){
        	num1[0] = arr.get(0);
        	num2[0] = arr.get(1);
        }
    }
}
