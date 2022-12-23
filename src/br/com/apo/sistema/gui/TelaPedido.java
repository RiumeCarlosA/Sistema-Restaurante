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

public class TelaPedido {
	public void criarJanela() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Sistema APO");
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton bt1 = new JButton("Principais");
		bt1.setFont(new Font("Dialog",5 , 12));
		bt1.setBounds(300, 330, 100, 80);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				TelaMesa telaMesa = new TelaMesa();
				telaMesa.criarJanela();
			}
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("Bebidas");
		bt2.setFont(new Font("Dialog",5 , 12));
		bt2.setBounds(600, 330, 100, 80);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				TelaMesa telaMesa = new TelaMesa();
				telaMesa.criarJanela();
			}
		});
		frame.add(bt2);
		
		JButton bt3 = new JButton("Pratos");
		bt3.setFont(new Font("Dialog",5 , 12));
		bt3.setBounds(900, 330, 100, 80);
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				TelaMesa telaMesa = new TelaMesa();
				telaMesa.criarJanela();
			}
		});
		frame.add(bt3);
		
		frame.setVisible(true);
	}
}
