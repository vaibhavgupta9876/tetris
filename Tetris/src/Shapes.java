import java.util.Random;

public class Shapes {
private int shape[][][]=new int[7][4][2];
Shapes()
{
	//Shape 1
	shape[0][0][0]=0;
	shape[0][0][1]=0;
	shape[0][1][0]=1;
	shape[0][1][1]=0;
	shape[0][2][0]=0;
	shape[0][2][1]=1;
	shape[0][3][0]=0;
	shape[0][3][1]=2;
	//Shape 2
	shape[1][0][0]=0;
	shape[1][0][1]=0;
	shape[1][1][0]=1;
	shape[1][1][1]=0;
	shape[1][2][0]=1;
	shape[1][2][1]=1;
	shape[1][3][0]=1;
	shape[1][3][1]=2;
	//Shape 3
	shape[2][0][0]=0;
	shape[2][0][1]=0;
	shape[2][1][0]=1;
	shape[2][1][1]=0;
	shape[2][2][0]=0;
	shape[2][2][1]=1;
	shape[2][3][0]=1;
	shape[2][3][1]=1;
	//Shape 4
	shape[3][0][0]=0;
	shape[3][0][1]=0;
	shape[3][1][0]=1;
	shape[3][1][1]=0;
	shape[3][2][0]=2;
	shape[3][2][1]=0;
	shape[3][3][0]=3;
	shape[3][3][1]=0;
	//Shape 5
	shape[4][0][0]=0;
	shape[4][0][1]=1;
	shape[4][1][0]=1;
	shape[4][1][1]=1;
	shape[4][2][0]=1;
	shape[4][2][1]=0;
	shape[4][3][0]=0;
	shape[4][3][1]=2;
	//Shape 6
	shape[5][0][0]=1;
	shape[5][0][1]=1;
	shape[5][1][0]=1;
	shape[5][1][1]=0;
	shape[5][2][0]=0;
	shape[5][2][1]=1;
	shape[5][3][0]=2;
	shape[5][3][1]=1;
	//Shape 7
	shape[6][0][0]=0;
	shape[6][0][1]=0;
	shape[6][1][0]=1;
	shape[6][1][1]=1;
	shape[6][2][0]=0;
	shape[6][2][1]=1;
	shape[6][3][0]=1;
	shape[6][3][1]=2;
}
int[][] getrand()
{
	Random r=new Random();
	int select=r.nextInt(7);
	int[][] grid =new int[4][2];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<2;j++)
		{
		   grid[i][j]=shape[select][i][j];
		}
	}
	return grid;
}
}
