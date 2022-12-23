package br.com.apo.sistema.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import br.com.apo.sistema.service.VerificarUsuario;


public class TelaLogin {
	
	public void criarJanela() {
		
		final JFrame frame = new JFrame();
		frame.setTitle("Sistema APO");
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Usuário:");
		lb1.setBounds(540, 250, 100, 20);
		lb1.setFont(new Font("Dialog",5 , 19));
		frame.add(lb1);
		
		final JTextArea ta1 = new JTextArea();
		ta1.setBounds(630, 252, 120, 20);
		ta1.setFont(new Font("Dialog",5 , 12));
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
		ta1.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta1);
		
		JLabel lb2 = new JLabel("Senha:");
		lb2.setBounds(540, 290, 100, 20);
		lb2.setFont(new Font("Dialog",5 , 19));
		frame.add(lb2);
		
		final JTextArea ta2 = new JTextArea();
		ta2.setBounds(630, 292, 120, 20);
		ta2.setFont(new Font("Dialog",5 , 12));
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
		ta2.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta2);
		
		
		JButton bt1 = new JButton("OK");
		bt1.setFont(new Font("Dialog",5 , 12));
		bt1.setBounds(540, 330, 80, 20);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				VerificarUsuario verificarUsuario = new VerificarUsuario(ta1.getText(), ta2.getText());
				String usuario = verificarUsuario.verificar();
				if(usuario == "GAR") {
					TelaMesa telaMesa = new TelaMesa();
					telaMesa.criarJanela();					
				}
				if(usuario == "incorreto") {
					System.out.println("cheguei aqui");
					JLabel lb3 = new JLabel("Usuário ou senha incorreto");
					lb3.setBounds(550, 305, 100, 10);
					lb3.setFont(new Font("Dialog",5 , 10));
					lb3.setBackground(Color.red);
					frame.add(lb3);
				}
				if(usuario == "ADM") {
					TelaAdmin telaAdmin = new TelaAdmin();
					telaAdmin.criarJanela();
				}
			}
		});
		frame.add(bt1);
		
		frame.setVisible(true);
	}
}
