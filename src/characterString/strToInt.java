package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ��һ���ַ���ת����һ��������Ҫ����ʹ���ַ���ת�������Ŀ⺯���� 
 * ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0
 * ��������:
 * ����һ���ַ���,����������ĸ����,����Ϊ��
 * �������:
 * ����ǺϷ�����ֵ����򷵻ظ����֣����򷵻�0
 */
public class strToInt {
    public int StrToInt(String str) {
        if(str==null||str.length()==0) return 0;
        char[] st = str.toCharArray();
        int fu = 0;
        if(st[0]=='-') fu=1;
        int sum=0;
        for(int i=fu;i<str.length();i++){
        	if(st[i]=='+'){
        		continue;
        	}
        	if(st[i]<'0'||st[i]>'9'){
        		return 0;
        	}
        	sum=sum*10+(st[i]-'0');
        }
        return fu==1?0-sum:sum;
    }
}
