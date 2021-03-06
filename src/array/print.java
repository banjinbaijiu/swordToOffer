package array;

import java.util.ArrayList;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class print {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(matrix.length==0||matrix[0].length==0) return arr;
        int n = matrix.length;
        int m = matrix[0].length;
        int layer = (Math.min(m,n)-1)/2+1;
        for(int i = 0;i<layer;i++){
            for(int k = i;k<m-i;k++) arr.add(matrix[i][k]);
            for(int k = i+1;k<n-i;k++) arr.add(matrix[k][m-i-1]);
            for(int k = m-i-2;(k>=i)&&((n-i-1)!=i);k--) arr.add(matrix[n-i-1][k]);
            for(int k = n-i-2;(k>i)&&((m-i-1)!=i);k--) arr.add(matrix[k][i]);
        }
         return arr;
     }
}
