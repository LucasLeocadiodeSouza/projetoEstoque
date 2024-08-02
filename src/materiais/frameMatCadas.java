package materiais;

import javax.swing.JFrame;

public class frameMatCadas {
	
	JFrame frame;
	
	public frameMatCadas(){
		
		frame = new JFrame("Cadastro de Materiais");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(820,520);
		frame.setLocationRelativeTo(null);
		
		
		
		frame.setVisible(true);
	}
	
}