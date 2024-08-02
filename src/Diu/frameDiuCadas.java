package Diu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frameDiuCadas {
	
	JFrame frame;
	JTextField modelText;
	JButton confirmar;
	JButton cancelar;
	JPanel modelPanel;
	JPanel dataVal;
	JTextField dataValField;
	JPanel botoesPanel;
	JPanel lotePanel;
	JTextField loteTextFiels;
	JLabel modelolabel;
	JLabel datalabel;
	JLabel lotelabel;
	
	public frameDiuCadas(){
		
		frame = new JFrame("Cadastro de Diu");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,270);
		frame.setLocationRelativeTo(null);
		
		
		modelPanel = new JPanel();
		modelPanel.setPreferredSize(new Dimension(0, 50));
		//modelPanel.setBackground(Color.red);
		modelPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30,20));
		
		modelolabel = new JLabel("Modelo: ");
		
		modelText = new JTextField();
		modelText.setPreferredSize(new Dimension(150,27));
		modelText.setFont(new Font("Arial", Font.PLAIN,14));
		modelText.setBackground(Color.black);
		modelText.setForeground(Color.white);
		
		frame.setLayout(new GridLayout(4,1));
		
		modelPanel.add(modelolabel);
		modelPanel.add(modelText);
		
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
		
		
		lotePanel = new JPanel();
		lotePanel.setPreferredSize(new Dimension(0, 50));
		//lotePanel.setBackground(Color.YELLOW);
		lotePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 40,0));
		loteTextFiels = new JTextField();
		loteTextFiels.setPreferredSize(new Dimension(150,27));
		loteTextFiels.setFont(new Font("Arial", Font.PLAIN,14));
		loteTextFiels.setBackground(Color.black);
		loteTextFiels.setForeground(Color.white);
		lotelabel = new JLabel("Lote: ");
		
		lotePanel.add(lotelabel);
		lotePanel.add(loteTextFiels);
		
		
		botoesPanel = new JPanel();
		botoesPanel.setPreferredSize(new Dimension(0, 60));
		botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 80,20));
		
		cancelar = new JButton("Cancelar");
		confirmar = new JButton("Confirmar");
		
		botoesPanel.add(cancelar);
		botoesPanel.add(confirmar);
		
		frame.add(modelPanel);
		frame.add(dataVal);
		frame.add(lotePanel);
		frame.add(botoesPanel);
		frame.setVisible(true);
	}
	
}
