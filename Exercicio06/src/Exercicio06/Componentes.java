package Exercicio06;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Componentes extends JFrame{
	
	//Args
	
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;
	
	//Construtores
	
	public Componentes() {
		super("JCheckBoxTest");
		setLayout(new FlowLayout());
		
		//Adicionando Botões
		
		textField = new JTextField("Veja o estilo da fonte mudar", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldCheckBox = new JCheckBox("Negrito");
		add(boldCheckBox);
		italicCheckBox= new JCheckBox("Itálico");
		add(italicCheckBox);
				
		//Os negócio lá que usa em checkbox vc sabe
		
		CheckBoxHandler handler = new CheckBoxHandler();
		
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
		
	}

	private class CheckBoxHandler implements ItemListener{
	
	public void itemStateChanged(ItemEvent event) {
		
		Font font = null;
		
		if (boldCheckBox.isSelected() && italicCheckBox.isSelected()) 
			font = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
		
		else if (boldCheckBox.isSelected()) 
			font = new Font ("Serif", font.BOLD, 14);
		
		else if (italicCheckBox.isSelected()) 
			font = new Font ("Serif", font.ITALIC, 14);
		
		else
			font = new Font ("Serif", font.PLAIN, 14);
		
		textField.setFont(font);
		
	}
		
	}


}
