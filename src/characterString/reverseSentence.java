package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��student. a am I����
 * ��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class reverseSentence {
    public String ReverseSentence(String str) {
        StringBuffer sb = new StringBuffer();
        if(str.trim().equals("")){
            return str;
        }
        String[] ss = str.split(" ");
        for(int i = ss.length-1;i>=0;i--){
            sb.append(ss[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
