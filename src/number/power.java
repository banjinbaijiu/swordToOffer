package number;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
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
