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

import br.com.apo.sistema.dao.DAO;
import br.com.apo.sistema.model.Administrador;
import br.com.apo.sistema.model.Bebida;
import br.com.apo.sistema.model.Garcom;
import br.com.apo.sistema.model.Prato;

public class TelaAdmin {
	
	public void criarJanela() {
		
		final JFrame frame = new JFrame();
		frame.setTitle("Sistema APO");
		frame.setSize(1366,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Adicionar garçom ");
		lb1.setBounds(30, 20, 200, 20);
		lb1.setFont(new Font("Dialog",5 , 19));
		frame.add(lb1);
		
		JLabel lb2 = new JLabel("Nome:");
		lb2.setBounds(50, 70, 100, 20);
		lb2.setFont(new Font("Dialog",5 , 13));
		frame.add(lb2);
		
		final JTextArea ta1 = new JTextArea();
		ta1.setBounds(150, 70, 120, 20);
		ta1.setFont(new Font("Dialog",5 , 12));
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
		ta1.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta1);
		
		
		JLabel lb3 = new JLabel("Usuário: ");
		lb3.setBounds(50, 130, 100, 20);
		lb3.setFont(new Font("Dialog",5 , 13));
		frame.add(lb3);
		
		final JTextArea ta2 = new JTextArea();
		ta2.setBounds(150, 130, 120, 20);
		ta2.setFont(new Font("Dialog",5 , 12));
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
		ta2.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta2);
		
		JLabel lb4 = new JLabel("Senha: ");
		lb4.setBounds(50, 180, 100, 20);
		lb4.setFont(new Font("Dialog",5 , 13));
		frame.add(lb4);
		
		final JTextArea ta3 = new JTextArea();
		ta3.setBounds(150, 180, 120, 20);
		ta3.setFont(new Font("Dialog",5 , 12));
        ta3.setLineWrap(true);
        ta3.setWrapStyleWord(true);
		ta3.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta3);
		
		JButton bt1 = new JButton("Adicionar");
		bt1.setFont(new Font("Dialog",5 , 12));
		bt1.setBounds(30, 240, 100, 20);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				Garcom garcom = new Garcom(ta1.getText(), ta2.getText(), ta3.getText());
				DAO<Garcom> dao = new DAO<>(Garcom.class);
				dao.abrirTransacao().incuir(garcom).fecharTransacao().fechar();
			}
		});
		frame.add(bt1);
		
		JLabel lb5 = new JLabel("Adicionar Administrador ");
		lb5.setBounds(300, 20, 250, 20);
		lb5.setFont(new Font("Dialog",5 , 19));
		frame.add(lb5);
		
		JLabel lb6 = new JLabel("Nome:");
		lb6.setBounds(320, 70, 100, 20);
		lb6.setFont(new Font("Dialog",5 , 13));
		frame.add(lb6);
		
		final JTextArea ta4 = new JTextArea();
		ta4.setBounds(420, 70, 120, 20);
		ta4.setFont(new Font("Dialog",5 , 12));
        ta4.setLineWrap(true);
        ta4.setWrapStyleWord(true);
		ta4.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta4);
		
		
		JLabel lb7 = new JLabel("Usuário: ");
		lb7.setBounds(320, 130, 100, 20);
		lb7.setFont(new Font("Dialog",5 , 13));
		frame.add(lb7);
		
		final JTextArea ta5 = new JTextArea();
		ta5.setBounds(420, 130, 120, 20);
		ta5.setFont(new Font("Dialog",5 , 12));
        ta5.setLineWrap(true);
        ta5.setWrapStyleWord(true);
		ta5.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta5);
		
		JLabel lb8 = new JLabel("Senha: ");
		lb8.setBounds(320, 180, 100, 20);
		lb8.setFont(new Font("Dialog",5 , 13));
		frame.add(lb8);
		
		final JTextArea ta6 = new JTextArea();
		ta6.setBounds(420, 180, 120, 20);
		ta6.setFont(new Font("Dialog",5 , 12));
        ta6.setLineWrap(true);
        ta6.setWrapStyleWord(true);
		ta6.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta6);
		
		JButton bt2 = new JButton("Adicionar");
		bt2.setFont(new Font("Dialog",5 , 12));
		bt2.setBounds(300, 240, 100, 20);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				Administrador administrador = new Administrador(ta4.getText(), ta5.getText(), ta6.getText());
				DAO<Administrador> dao = new DAO<>(Administrador.class);
				dao.abrirTransacao().incuir(administrador).fecharTransacao().fechar();
			}
		});
		frame.add(bt2);
		
		JLabel lb12 = new JLabel("Adicionar prato ");
		lb12.setBounds(30, 300, 250, 20);
		lb12.setFont(new Font("Dialog",5 , 19));
		frame.add(lb12);
		
		JLabel lb9 = new JLabel("Nome: ");
		lb9.setBounds(50, 350, 100, 20);
		lb9.setFont(new Font("Dialog",5 , 13));
		frame.add(lb9);
		
		final JTextArea ta7 = new JTextArea();
		ta7.setBounds(150, 350, 120, 20);
		ta7.setFont(new Font("Dialog",5 , 12));
        ta7.setLineWrap(true);
        ta7.setWrapStyleWord(true);
		ta7.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta7);
		
		JLabel lb10 = new JLabel("Descrição: ");
		lb10.setBounds(50, 400, 100, 20);
		lb10.setFont(new Font("Dialog",5 , 13));
		frame.add(lb10);
		
		final JTextArea ta8 = new JTextArea();
		ta8.setBounds(50, 440, 220, 70);
		ta8.setFont(new Font("Dialog",5 , 12));
        ta8.setLineWrap(true);
        ta8.setWrapStyleWord(true);
		ta8.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta8);
		
		JLabel lb11 = new JLabel("Preço: ");
		lb11.setBounds(50, 540, 100, 20);
		lb11.setFont(new Font("Dialog",5 , 13));
		frame.add(lb11);
		
		final JTextArea ta9 = new JTextArea();
		ta9.setBounds(150, 540, 120, 20);
		ta9.setFont(new Font("Dialog",5 , 12));
        ta9.setLineWrap(true);
        ta9.setWrapStyleWord(true);
		ta9.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta9);
		
		JButton bt3 = new JButton("Adicionar");
		bt3.setFont(new Font("Dialog",5 , 12));
		bt3.setBounds(30, 600, 100, 20);
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				Prato prato = new Prato(ta7.getText(), Double.valueOf(ta9.getText()));
				DAO<Prato> dao = new DAO<>(Prato.class);
				dao.abrirTransacao().incuir(prato).fecharTransacao().fechar();
			}
		});
		frame.add(bt3);
		
		JLabel lb13 = new JLabel("Adicionar Bebida ");
		lb13.setBounds(300, 300, 250, 20);
		lb13.setFont(new Font("Dialog",5 , 19));
		frame.add(lb13);
		
		JLabel lb14 = new JLabel("Nome:");
		lb14.setBounds(320, 350, 100, 20);
		lb14.setFont(new Font("Dialog",5 , 13));
		frame.add(lb14);
		
		final JTextArea ta10 = new JTextArea();
		ta10.setBounds(420, 350, 120, 20);
		ta10.setFont(new Font("Dialog",5 , 12));
        ta10.setLineWrap(true);
        ta10.setWrapStyleWord(true);
		ta10.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta10);
		
		
		JLabel lb15 = new JLabel("Preço: ");
		lb15.setBounds(320, 400, 100, 20);
		lb15.setFont(new Font("Dialog",5 , 13));
		frame.add(lb15);
		
		final JTextArea ta11 = new JTextArea();
		ta11.setBounds(420, 400, 120, 20);
		ta11.setFont(new Font("Dialog",5 , 12));
        ta11.setLineWrap(true);
        ta11.setWrapStyleWord(true);
		ta11.setBorder(BorderFactory.createLineBorder(Color.gray));
		frame.add(ta11);
		
		JButton bt4 = new JButton("Adicionar");
		bt4.setFont(new Font("Dialog",5 , 12));
		bt4.setBounds(300, 450, 100, 20);
		bt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				Bebida bebida = new Bebida(ta10.getText(), Double.valueOf(ta11.getText()));
				DAO<Bebida> dao = new DAO<>(Bebida.class);
				dao.abrirTransacao().incuir(bebida).fecharTransacao().fechar();
			}
		});
		frame.add(bt4);
		
		frame.setVisible(true);
	}
}
