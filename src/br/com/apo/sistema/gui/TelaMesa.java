package br.com.apo.sistema.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TelaMesa {
	
	public void criarJanela() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Sistema APO");
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Número da mesa:");
		lb1.setBounds(500, 250, 200, 20);
		lb1.setFont(new Font("Dialog",5 , 19));
		frame.add(lb1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(680, 252, 120, 20);
		ta1.setFont(new Font("Dialog",5 , 12));
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
		ta1.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta1);
		
		JButton bt1 = new JButton("OK");
		bt1.setFont(new Font("Dialog",5 , 12));
		bt1.setBounds(600, 300, 80, 20);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				TelaPedido telaPedido = new TelaPedido();
				telaPedido.criarJanela();
			}
		});
		frame.add(bt1);	
		
		
		frame.setVisible(true);
	}
}
