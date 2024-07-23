package frames;

import java.awt.Point;

import javax.swing.JFrame;

public class CadastrosWindow {
	
	JFrame cadastrosWindow;
	
	public CadastrosWindow() {
		
		cadastrosWindow = new JFrame();
		cadastrosWindow.setSize(200,700);
		cadastrosWindow.setResizable(false);
		cadastrosWindow.setLocationRelativeTo(null);
		cadastrosWindow.setVisible(true);
		CadastrosWindow.localeFrame();
		
	}
	
	public void localeFrame(int x, int y, int z) {
		
		HomeWindow homeWindow = new HomeWindow();
		cadastrosWindow.setLocation(new Point(x, y + z));
		
	}
}
