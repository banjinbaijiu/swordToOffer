package array;
/**
 * 
 * @author 陈奎
 * 题目描述
 * 地上有一个m行和n列的方格。
 * 一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
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
