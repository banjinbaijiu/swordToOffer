package array;
/**
 * 
 * @author �¿�
 * ��Ŀ����
 * ������һ��m�к�n�еķ���
 * һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
 * ���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
 * ���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 */
public class moveCount {
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] visited = new int[rows][cols];
        return helper(threshold,rows,cols,0,0,visited);
    }

	private int helper(int threshold, int rows, int cols, int i, int j, int[][] visited) {
		if(i<0||i>=rows||j<0||j>=cols||visited[i][j]==1||(hsum(i,j)>threshold)){
			return 0;
		}
		visited[i][j]=1;
		return helper(threshold, rows, cols, i-1, j, visited)+
				helper(threshold, rows, cols, i+1, j, visited)+
				helper(threshold, rows, cols, i, j-1, visited)+
				helper(threshold, rows, cols, i, j+1, visited)+1;
	}

	private int hsum(int i, int j) {
		int su = 0;
		while(i!=0){
			su+=i%10;
			i=i/10;
		}
		while(j!=0){
			su+=j%10;
			j=j/10;
		}
		return su;
	}
}
