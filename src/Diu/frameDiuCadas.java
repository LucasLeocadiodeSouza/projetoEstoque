package Diu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frameDiuCadas implements ActionListener {
	
	JFrame frame;
	JTextField modelTextField;
	JButton cadastrar;
	JButton cancelar;
	JPanel modelPanel;
	JPanel dataVal;
	JTextField dataValField;
	JPanel botoesPanel;
	JPanel lotePanel;
	JTextField loteTextField;
	JLabel modelolabel;
	JLabel datalabel;
	JLabel lotelabel;
	EstoqueDiu estoqueDiu = new EstoqueDiu();
	
	public frameDiuCadas() {
		
	}
	
	public frameDiuCadas(String name){
		
		frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,270);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(4,1));
		
		
		//modelo 
		modelPanel = new JPanel();
		modelPanel.setPreferredSize(new Dimension(0, 50));
		//modelPanel.setBackground(Color.red);
		modelPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30,20));
		modelolabel = new JLabel("Modelo: ");
		modelTextField = new JTextField();
		modelTextField.setPreferredSize(new Dimension(150,27));
		modelTextField.setFont(new Font("Arial", Font.PLAIN,14));
		modelTextField.setBackground(Color.black);
		modelTextField.setForeground(Color.white);
		modelPanel.add(modelolabel);
		modelPanel.add(modelTextField);
		
		
		//Data de Validade
		dataVal = new JPanel();
		dataVal.setPreferredSize(new Dimension(0, 50));
		//dataVal.setBackground(Color.GREEN);
		dataVal.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
		dataValField = new JTextField();	
		dataValField.setPreferredSize(new Dimension(150,27));
		dataValField.setFont(new Font("Arial", Font.PLAIN,14));
		dataValField.setBackground(Color.black);
		dataValField.setForeground(Color.white);
		datalabel = new JLabel("Data de Validade: ");
		dataVal.add(datalabel);
		dataVal.add(dataValField);
		
		
		//lote
		lotePanel = new JPanel();
		lotePanel.setPreferredSize(new Dimension(0, 50));
		//lotePanel.setBackground(Color.YELLOW);
		lotePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 40,0));
		loteTextField = new JTextField();
		loteTextField.setPreferredSize(new Dimension(150,27));
		loteTextField.setFont(new Font("Arial", Font.PLAIN,14));
		loteTextField.setBackground(Color.black);
		loteTextField.setForeground(Color.white);
		lotelabel = new JLabel("Lote: ");
		lotePanel.add(lotelabel);
		lotePanel.add(loteTextField);
		
		
		//botoes cancelar e confirmar
		botoesPanel = new JPanel();
		botoesPanel.setPreferredSize(new Dimension(0, 60));
		botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 80,20));
		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(this);
		cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(this);
		botoesPanel.add(cancelar);
		botoesPanel.add(cadastrar);
		
		
		
		frame.add(modelPanel);
		frame.add(dataVal);
		frame.add(lotePanel);
		frame.add(botoesPanel);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastrar) {
	        diu diu = new diu();
			diu.setModel(modelTextField.getText());
			diu.setValidade(Integer.parseInt(dataValField.getText()));
			diu.setLote(loteTextField.getText());
			
			System.out.println("Diu = " + diu.getModel());
			System.out.println("Data de Validade = " + diu.getValidade());
			System.out.println("Diu = " + diu.getLote());
			
			frame.dispose();
		}else if(e.getSource()==cancelar) {
			frame.dispose();
		}
	}
}