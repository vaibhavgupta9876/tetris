import javax.swing.*;
import java.awt.Graphics;
public class MainFrame {
public static void main(String args[])
{
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			new Board().setVisible(true);
		}
	});
}
}
