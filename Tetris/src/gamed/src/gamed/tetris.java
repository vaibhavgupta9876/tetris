package gamed;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.*;

import javax.swing.JApplet;
import javax.swing.JButton;

import org.omg.CORBA.FREE_MEM;

public class tetris extends JApplet {
	boolean gameover=false;
	int y_max=-1, x_max=-1;
	int[][] grid1=new int[4][2];
	Timer t;
	int y=0;
	int x=20;
	JButton j;
	Board b =new Board();
    int grid[][]= new int[41][41];
    
	public void init()
	{
		
		
		j=new JButton("Hello");
		j.setVisible(true);
		j.setBounds(50,450,100,20);
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				x+=1;
				repaint();
			}
		});
		add(j);
		setLayout(null);
		this.setSize(500,500);
		for(int i=0;i<=40;i++)
		{
			for(int j=0;j<=40;j++)
			{
				grid[i][j]=0;
				if(i==40||j==40)
					grid[i][j]=1;
			}
		}
		
		int r=0;
		
		int temp;
		Random ran= new Random();
		while(r<2)
		{
		Shapes s=new Shapes();
		temp=ran.nextInt(7);
		for(int i=0;i<4;i++)
		{
	    grid1[i][0]=s.shape[r][i][0];
	    grid1[i][1]=s.shape[r][i][1];
		}
		t=new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				y+=1;
				if(grid[x][y+y_max+1]==1)
					{
					cancel();
					for(int i=0;i<4;i++)
					{
				        grid[grid1[i][0]+x][grid1[i][1]+y]=1;
				        repaint();
					}
					x=20;
					y=0;
					}
				repaint();
			}
		},0,500);
		r++;
		}
	}
	public void Fun(Graphics g)
	{
		
	    g.setColor(Color.BLACK);
		for(int i=0;i<4;i++)
		{
			if(grid1[i][1]>=y_max)
				y_max=grid1[i][1];
	        g.fillRect(10*(grid1[i][0]+x),10*(grid1[i][1]+y),10,10);
		}
	}
public void paint( Graphics g){
	g.setColor(Color.lightGray);
	g.fillRect(0,0,400,400);    
	Fun(g);
	for(int i=0;i<40;i++)
{
		for(int j=0;j<40;j++)
		{
		 if(grid[i][j]==1)
	     g.fillRect(i*10,j*10,10,10);
		}
}
}
}