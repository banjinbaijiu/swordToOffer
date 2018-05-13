package characterString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * �������:
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
 */
public class firstAppearingOnce {
    //Insert one char from stringstream
	HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    public void Insert(char ch)
    {
    	if(map.containsKey(ch)){
    		map.put(ch, map.get(ch)+1);
    	}else{
    		map.put(ch, 1);
    	}
        
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for(Map.Entry<Character, Integer> en:map.entrySet()){
    		if(en.getValue()==1) return en.getKey();
    	}
    	return '#';
    
    }
}
