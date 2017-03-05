package gamed;

public class Board {
  int board_t[][]= new int[40][40];
  Board()
  {
	  for(int i=0;i<40;i++)
	  {
		  for(int j=0;j<40;j++)
			  board_t[i][j]=0;
	  }
  }
}
