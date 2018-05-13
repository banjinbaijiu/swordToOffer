package characterString;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
