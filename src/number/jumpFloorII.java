package number;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */
public class jumpFloorII {
    public int JumpFloorII(int target) {
        if(target<=0){
            return 0;
        }else if(target==1){
            return 1;
        }else{
            return JumpFloorII(target-1)*2;
        }
    }
}
