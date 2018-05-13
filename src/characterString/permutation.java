package characterString;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> arr  = new ArrayList<String>();
         if(str!=null&&str.length()>0){
             Helper(arr,str.toCharArray(),0);
             Collections.sort(arr);
         }
         return arr;
     }
     public void Helper(ArrayList<String> arr,char[] charArray,int i){
         if(i==charArray.length-1){
             String val = String.valueOf(charArray);
             if(!arr.contains(val)){
                 arr.add(val);
             }
         }else{
             for(int j=i;j<charArray.length;j++){
                 swap(charArray,i,j);
                 Helper(arr,charArray,i+1);
                 swap(charArray,i,j);
             }
         }        
     }
     public void swap(char[] charArray,int i,int j){
         char temp = charArray[i];
         charArray[i] = charArray[j];
         charArray[j] = temp;
     }
}
