package Codigos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener{
	JLabel Nome = new JLabel("Nome", JLabel.HEIGHT);
	JLabel Senha = new JLabel("Senha", JLabel.LEFT);
	JLabel Coment = new JLabel("Comentário", JLabel.CENTER);
	JTextField User = new JTextField(40);
	JTextField Password = new JTextField(40);
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancelar");
	JTextArea comentar = new JTextArea("Comentários", 10,20);
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ok) {
			JOptionPane.showInternalMessageDialog(null, "Cadastro concluído");
		}
		if(e.getSource()==cancel) {
			JOptionPane.showInternalMessageDialog(null, "Cadastro Cancelado");
			System.exit(0);
		}
	}
	public Formulario(){
		setLayout(new FlowLayout());
		add(Nome);
		add(User);
		add(Senha);
		add(Password);
		add(Coment);
		add(comentar);
		ok.addActionListener(this);
		cancel.addActionListener(this);
		ok.setBounds(50,50,80,30);
		add(ok);
		cancel.setBounds(50,50,80,30);
		add(cancel);
		setTitle("Primeira Janela");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(true);
	}
	


	public static void main(String[] args) {
		new Formulario();

	}

}
