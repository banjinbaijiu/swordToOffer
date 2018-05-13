package characterString;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 
 * 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
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
