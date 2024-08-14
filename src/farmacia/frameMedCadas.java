package farmacia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frameMedCadas {
	
	JFrame frame;
	JComboBox classCB;
	String[] vClassCB = {"Analgésico", "Anti-Inflamatorio", "Anti-Biotipo"}; //precisava criar uma classe para isso, com sua descricao, medicacao...
	JComboBox tipoCB;
	String[] vTipoCB = {"Similar","Referencia","Generico"}; //criar uma classe para tipos tambem
	
	public frameMedCadas(){
		
		frame = new JFrame("Cadastro de Materiais");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(800,600);
		frame.setLayout(new GridLayout(4,1));
		frame.setLocationRelativeTo(null);
		
		
		JPanel divisao1 = new JPanel();
		JPanel subDivEsquerda = new JPanel();
		subDivEsquerda.setBackground(Color.red);
		
		JPanel subDivDireita = new JPanel();
		subDivDireita.setBackground(Color.blue);
		tipoCB = new JComboBox(vTipoCB);
		JLabel tipoL = new JLabel("Tipo: ");
		tipoCB.setPreferredSize(new Dimension(110, 25));
		tipoCB.setFont(new Font("Arial", Font.PLAIN,14));
		tipoCB.setBackground(Color.black);
		tipoCB.setForeground(Color.white);
		

		divisao1.setBackground(Color.green);
		divisao1.setLayout(new GridLayout(1,2));
		divisao1.add(subDivEsquerda);
		divisao1.add(subDivDireita);
		subDivDireita.add(tipoL);
		subDivDireita.add(tipoCB);
		
		
		
		JPanel divisao2 = new JPanel();
		divisao2.setBackground(Color.yellow);
		divisao2.setLayout(null);
		JTextField loteTF = new JTextField("Lote");
		JLabel loteL = new JLabel("Lote: ");
		loteL.setLayout(null);
		loteL.setBounds(27,25,100,27);
		loteTF.setBounds(65,25,100,27);
		loteTF.setFont(new Font("Arial", Font.PLAIN,14));
		loteTF.setBackground(Color.black);
		loteTF.setForeground(Color.white);
		
		JTextField validadeTF = new JTextField("Data de validade");
		JLabel validadeL = new JLabel("Validade: ");
		validadeL.setLayout(null);
		validadeL.setBounds(175,25,100,27);
		validadeTF.setBounds(233,25,87,27);
		validadeTF.setFont(new Font("Arial", Font.PLAIN,14));
		validadeTF.setBackground(Color.black);
		validadeTF.setForeground(Color.white);
		
		JTextField marcaTF = new JTextField("Marca");
		JLabel marcaL = new JLabel("Marca: ");
		marcaL.setLayout(null);
		marcaL.setBounds(331,25,100,27);
		marcaTF.setBounds(377,25,100,27);
		marcaTF.setFont(new Font("Arial", Font.PLAIN,14));
		marcaTF.setBackground(Color.black);
		marcaTF.setForeground(Color.white);
		
		classCB = new JComboBox(vClassCB);
		JLabel classL = new JLabel("Classificação: ");
		classL.setLayout(null);
		classL.setBounds(488,25,100,27);
		classCB.setBounds(573,25,150,27);
		classCB.setFont(new Font("Arial", Font.PLAIN,14));
		classCB.setBackground(Color.black);
		classCB.setForeground(Color.white);
		
		divisao2.add(loteL);
		divisao2.add(loteTF);
		divisao2.add(validadeL);
		divisao2.add(validadeTF);
		divisao2.add(marcaL);
		divisao2.add(marcaTF);
		divisao2.add(classCB);
		divisao2.add(classL);
		
		JPanel divisao3 = new JPanel();
		divisao3.setBackground(Color.LIGHT_GRAY);
		divisao3.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		
		JPanel divisao4 = new JPanel();
		divisao4.setBackground(Color.GRAY);
		divisao4.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		
		frame.add(divisao1);
		frame.add(divisao2);
		frame.add(divisao3);
		frame.add(divisao4);
		frame.setVisible(true);
	}
	
}