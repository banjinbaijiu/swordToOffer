package number;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ����һ��double���͵ĸ�����base��int���͵�����exponent��
 * ��base��exponent�η���
 */
public class power {
    public double Power(double base, int exponent) {
        double result = 1;
        for(int i=1;i<=Math.abs(exponent);i++){
        	result *= base;
        }
        if(exponent<0){
        	return 1/result;
        }else{
        	return result;
        }
  }
}
