package frames;

import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CadastrosWindow {
	
	JFrame cadastrosWindow;
	
	public CadastrosWindow() {
		cadastrosWindow = new JFrame();
		cadastrosWindow.setSize(200,700);
		cadastrosWindow.setResizable(false);
		cadastrosWindow.setLocationRelativeTo(null);
		cadastrosWindow.setVisible(true);
	}
	
	public CadastrosWindow(Point locCadastro, JButton butao) {
		
		int locHeight =  butao.getHeight();
		
		cadastrosWindow = new JFrame();
		cadastrosWindow.setSize(200,700);
		cadastrosWindow.setResizable(false);
		cadastrosWindow.setLocation(locCadastro.x, locCadastro.y + locHeight);
		cadastrosWindow.setVisible(true);
		
		
	}
	
}
