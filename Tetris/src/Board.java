import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends Canvas{
	 JPanel j;
	 int grid1[][]=new int[4][2];
	 Board()
	 {
	     Graphics g = getGraphics();
		 setSize(500,500);
		 j=new JPanel();
		 j.setSize(400,400);
		 j.setBackground(Color.WHITE);
		 //add(j);
		 Shapes s=new Shapes();
			grid1[0][0]=0;
			grid1[0][1]=0;
			grid1[1][0]=1;
			grid1[1][1]=0;
			grid1[2][0]=0;
			grid1[2][1]=1;
			grid1[3][0]=0;
			grid1[3][1]=2;
			g.setColor(Color.BLACK);
			g.fillRect(200,0,1,1);
			 //grid1=s.getrand();
			 //for(int k=0;k<4;k++)
			 //{
				//g.fillRect(grid1[k][0],grid1[k][1],1,1);
			 //}
		 
		 //setLayout(null);
	 }
     
}
