package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S��
 * �������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class leftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str==null||str.equals("")) return str;
        int len = str.length();
        n = n%len;
        return str.substring(n, len)+str.substring(0, n);
    }
}
