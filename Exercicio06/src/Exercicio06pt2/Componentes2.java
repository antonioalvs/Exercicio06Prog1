package Exercicio06pt2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Componentes2 extends JFrame{
	
	private JTextField textField;
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private JRadioButton plainButton;
	private JRadioButton boldButton;
	private JRadioButton italicButton;
	private JRadioButton boldItalicButton;
	private ButtonGroup radioGroup;
	
	public Componentes2() {
		super("Radio Button Test");
		setLayout (new FlowLayout());
		
		//Setando a interface eu acho
		
		textField = new JTextField("Veja o estilo da fonte mudar", 25);
		add(textField);
		
		plainButton = new JRadioButton("Plain", true);
		add(plainButton);
		boldButton = new JRadioButton("Bold", false);
		add(boldButton);
		italicButton = new JRadioButton("Italic", false);
		add(italicButton);
		boldItalicButton = new JRadioButton("Bold + Italic", false);
		add(boldItalicButton);
		
		//Relacionamento Lógico
		radioGroup = new ButtonGroup();
		radioGroup.add(plainButton);
		radioGroup.add(boldButton);
		radioGroup.add(italicButton);
		radioGroup.add(boldItalicButton);
		
		//Criando os objetos das fontes
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		//Eventos
		
		plainButton.addItemListener(new radioButtonHandler(plainFont));
		boldButton.addItemListener(new radioButtonHandler(boldFont));
		italicButton.addItemListener(new radioButtonHandler(italicFont));
		boldItalicButton.addItemListener(new radioButtonHandler(boldItalicFont));	
	}
	
	private class radioButtonHandler implements ItemListener{
		
		private Font font;
		
		public radioButtonHandler(Font F) {
			font = F;
		}
		
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}
	}

}
