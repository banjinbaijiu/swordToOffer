package number;

import java.util.ArrayList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 */
public class findNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(array==null||array.length<=0) return arr;
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                arr.add(array[i]);
                arr.add(array[j]);
                break;
            }else if(array[i]+array[j]<sum){
                i++;
            }else{
                j--;
            }
        }
        return arr;
    }
}
