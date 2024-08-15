package farmacia;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class frameMedCadas {
	
	JFrame frame;
	JTextField usuarioTF;
	JFormattedTextField dataTF;
	JTextField loteTF;
	JTextField validadeTF;
	JTextField marcaTF;
	JComboBox classCB;
	String[] vClassCB = {"Analgésico", "Anti-Inflamatorio", "Anti-Biotipo"}; //precisava criar uma classe para isso, com sua descricao, medicacao...
	JComboBox tipoCB;
	String[] vTipoCB = {"Similar","Referencia","Generico"}; //criar uma classe para tipos tambem
	
	public frameMedCadas(){
		
		frame = new JFrame("Cadastro de Materiais");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(710,500);
		frame.setLayout(new GridLayout(4,1));
		frame.setLocationRelativeTo(null);
		
		
		JPanel divisao1 = new JPanel();
		JPanel subDivEsquerda = new JPanel();
		subDivEsquerda.setLayout(null);
		subDivEsquerda.setBackground(Color.red);
		usuarioTF = new JTextField("@Usuario");
		JLabel usuarioL = new JLabel("Usuario: ");
		usuarioL.setBounds(45,18,100,27);
		usuarioTF.setBounds(100,18,150,27);
		usuarioTF.setFont(new Font("Arial", Font.PLAIN,14));
		usuarioTF.setBackground(Color.black);
		usuarioTF.setForeground(Color.LIGHT_GRAY);
		usuarioTF.setEditable(false);
		
		JLabel dataNowL = new JLabel("Data: ");
		dataNowL.setBounds(63,60,100,27);
		SimpleDateFormat formatted = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String dataInic = formatted.format(new Date());
		MaskFormatter dateMask = null;
		try {
            dateMask = new MaskFormatter("##/##/#### ##:##");
            dateMask.setPlaceholderCharacter('_'); // Caracter que aparecerá no lugar dos números
        } catch (ParseException e) {
            e.printStackTrace();
        }
		dataTF = new JFormattedTextField(dateMask);
		dataTF.setValue(dataInic);
		dataTF.setBounds(100,60,130,27);
		dataTF.setFont(new Font("Arial", Font.PLAIN,14));
		dataTF.setBackground(Color.black);
		dataTF.setForeground(Color.LIGHT_GRAY);
		dataTF.setEditable(false);
		
		
		JPanel subDivDireita = new JPanel();
		subDivDireita.setBackground(Color.blue);
		subDivDireita.setLayout(null);
		tipoCB = new JComboBox(vTipoCB);
		JLabel tipoL = new JLabel("Tipo: ");
		tipoL.setBounds(195,60,100,27);
		tipoCB.setBounds(230,60,100,27);
		tipoCB.setFont(new Font("Arial", Font.PLAIN,14));
		tipoCB.setBackground(Color.black);
		tipoCB.setForeground(Color.white);
		

		divisao1.setBackground(Color.green);
		divisao1.setLayout(new GridLayout(1,2));
		divisao1.add(subDivEsquerda);
		divisao1.add(subDivDireita);
		subDivDireita.add(tipoL);
		subDivDireita.add(tipoCB);
		subDivEsquerda.add(usuarioTF);
		subDivEsquerda.add(usuarioL);
		subDivEsquerda.add(dataTF);
		subDivEsquerda.add(dataNowL);
		
		
		
		JPanel divisao2 = new JPanel();
		divisao2.setBackground(Color.yellow);
		divisao2.setLayout(null);
		loteTF = new JTextField("Lote");
		JLabel loteL = new JLabel("Lote: ");
		loteL.setLayout(null);
		loteL.setBounds(12,10,100,27);
		loteTF.setBounds(44,10,100,27);
		loteTF.setFont(new Font("Arial", Font.PLAIN,14));
		loteTF.setBackground(Color.black);
		loteTF.setForeground(Color.white);
		
		
		validadeTF = new JTextField("Data de validade");
		JLabel validadeL = new JLabel("Validade: ");
		validadeL.setBounds(155,10,100,27);
		MaskFormatter dateMaskValid = null;
		try {
			dateMaskValid = new MaskFormatter("##/##/####");
			dateMaskValid.setPlaceholderCharacter('_'); // Caracter que aparecerá no lugar dos números
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		validadeTF = new JFormattedTextField(dateMaskValid);
		validadeTF.setBounds(210,10,87,27);
		validadeTF.setFont(new Font("Arial", Font.PLAIN,14));
		validadeTF.setBackground(Color.black);
		validadeTF.setForeground(Color.white);
		
		
		marcaTF = new JTextField("Marca");
		JLabel marcaL = new JLabel("Marca: ");
		marcaL.setLayout(null);
		marcaL.setBounds(307,10,100,27);
		marcaTF.setBounds(350,10,100,27);
		marcaTF.setFont(new Font("Arial", Font.PLAIN,14));
		marcaTF.setBackground(Color.black);
		marcaTF.setForeground(Color.white);
		
		classCB = new JComboBox(vClassCB);
		JLabel classL = new JLabel("Classificação: ");
		classL.setLayout(null);
		classL.setBounds(458,10,100,27);
		classCB.setBounds(540,10,150,27);
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