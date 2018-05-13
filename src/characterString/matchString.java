package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��
 * ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
 * ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 */
public class matchString {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null){
        	return false;
        }
        int strIndex=0;
        int patternIndex=0;
        return matchCore(str,strIndex,pattern,patternIndex);
    }

	private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		if(strIndex==str.length&&patternIndex==pattern.length){
			return true;
		}
		if(strIndex!=str.length&&patternIndex==pattern.length){
			return false;
		}
		if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*'){
			if((strIndex!=str.length&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&strIndex!=str.length)){
				return matchCore(str, strIndex, pattern, patternIndex+2)
						||matchCore(str, strIndex+1, pattern, patternIndex+2)
						||matchCore(str, strIndex+1, pattern, patternIndex);
			}else{
				return matchCore(str, strIndex, pattern, patternIndex+2);
			}
		}
		if((strIndex!=str.length&&pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.'&&strIndex!=str.length)){
			return matchCore(str, strIndex+1, pattern, patternIndex+1);
		}	
		
		return false;
	}
    
}
