package number;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 */
public class numberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0){
            return 0;
        }else{
            int count=0;
            for(int i=1;i<=n;i++){
                int temp = i;
                while(temp!=0){
                    if(temp%10==1){
                        count++;
                    }
                    temp /= 10;
                }                
            }
            return count;
        }
    }
}
