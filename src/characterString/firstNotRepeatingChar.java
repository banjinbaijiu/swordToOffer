package characterString;

import java.util.HashMap;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��һ���ַ���(1<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
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
