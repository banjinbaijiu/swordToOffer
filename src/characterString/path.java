package characterString;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ������������ң����ϣ������ƶ�һ�����ӡ�
 * ���һ��·�������˾����е�ĳһ�����ӣ����·�������ٽ���ø��ӡ� 
 * ���� a b c e s f c s a d e e �����а���һ���ַ���"bcced"��·����
 * ���Ǿ����в�����"abcb"·������Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��·�������ٴν���ø��ӡ�
 */
public class path {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	boolean[] visited = new boolean[matrix.length];
    	for(int i=0;i<rows;i++){
    		for(int j=0;j<cols;j++){
    			if(helper(matrix,rows,cols,i,j,0,str,visited)){
    				return true;
    			}
    		}
    	}
    	return false;        
    }

	private boolean helper(char[] matrix, int rows, int cols, int i, int j, int k, char[] str, boolean[] visited) {
		if(i<0||i>=rows||j<0||j>=cols||matrix[i*cols+j]!=str[k]||visited[i*cols+j]){
			return false;
		}
		if(k==str.length-1) return true;
		visited[i*cols+j]=true;
		if(helper(matrix, rows, cols, i-1, j, k+1, str, visited)||helper(matrix, rows, cols, i+1, j, k+1, str, visited)
				||helper(matrix, rows, cols, i, j-1, k+1, str, visited)||helper(matrix, rows, cols, i, j+1, k+1, str, visited)){
			return true;
		}
		visited[i*cols+j]=false;
		return false;
	}

}
