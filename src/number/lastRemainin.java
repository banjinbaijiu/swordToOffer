package number;

import java.util.ArrayList;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�
 * HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��
 * Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 */
public class lastRemainin {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0||m==0) return -1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        	arr.add(i);
        }
        int index = 0;
        while(arr.size()>1){
        	index = (index+m-1)%arr.size();
        	arr.remove(index);
        }
        return arr.get(0);
    }
}
