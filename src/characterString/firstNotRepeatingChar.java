package characterString;

import java.util.HashMap;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class firstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str.length()==0||str==null) return -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
      	  if(map.containsKey(str.charAt(i))){
      		  map.put(str.charAt(i), map.get(str.charAt(i))+1);
      	  }else{
      		  map.put(str.charAt(i),1);
      	  }
        }
        int pos=0;
        for(int j=0;j<str.length();j++){
      	  if(map.get(str.charAt(j))==1){
      		  pos = j;
      		  break;
      	  }
        }
        return pos;
      }
}
