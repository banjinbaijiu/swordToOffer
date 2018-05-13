package characterString;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
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
