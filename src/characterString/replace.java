package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class replace {
    public String replaceSpace(StringBuffer str) {
    	String strr = str.toString();
    	char[] ch = strr.toCharArray();
    	StringBuffer sb = new StringBuffer();
    	for(int i = 0;i<ch.length;i++){
    		if(ch[i] == ' '){
    			sb.append("%20");
    		}else{
    			sb.append(ch[i]);
    		}
    	}
    	return sb.toString();
    }
}
