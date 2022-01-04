package yeni;

import java.awt.EventQueue;
import java.awt.Frame;

import dbase.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Dialog;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class giris {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;
	private JButton btnGoster;
	private JButton btnSifremiUnuttum;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris window = new giris();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public giris() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(500,300);
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		JLabel userName = new JLabel("Kullanici Adi");
		userName.setBounds(12, 90, 85, 15);
		frame.getContentPane().add(userName);
		
		username = new JTextField();
		username.setBounds(157, 88, 172, 19);
		username.setColumns(10);
		frame.getContentPane().add(username);
		
		JButton btnGiris = new JButton("Giris");
		btnGiris.setBounds(244, 142, 85, 47);
		frame.getContentPane().add(btnGiris);
		
		JLabel password = new JLabel("Sifre");
		password.setBounds(12, 117, 33, 15);
		frame.getContentPane().add(password);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 115, 172, 19);
		frame.getContentPane().add(passwordField);
		
		btnGoster = new JButton("Goster");
		btnGoster.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				passwordField.setEchoChar((char)0);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				passwordField.setEchoChar('*');
			}
		});
		

		btnGoster.setBounds(341, 107, 117, 25);
		frame.getContentPane().add(btnGoster);
		
		btnSifremiUnuttum = new JButton("Sifremi Unuttum");
		btnSifremiUnuttum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sifremiUnuttum frame3 = new sifremiUnuttum();
				frame3.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnSifremiUnuttum.setBounds(157, 226, 172, 25);
		frame.getContentPane().add(btnSifremiUnuttum);
		

		
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = username.getText();
				String pass = String.valueOf(passwordField.getPassword()); 
				MysqlDb users = new MysqlDb();
				String ss = users.userControl(user);
				if (pass.equalsIgnoreCase(ss)) {
					menuuu frame2 = new menuuu();
					//ogrenci.setSize(500,500);
					frame2.setVisible(true);
					frame.setVisible(false);
					
					
				}
				else if (ss==null) {
					JOptionPane.showMessageDialog(userName, "Kullanici bulunamadi");
				}
				else if(ss!=pass) {
					JOptionPane.showMessageDialog(btnGiris, user+" icin hatali sifre");
				}
				else {
					JOptionPane.showMessageDialog(username, "veritabani hatasi");
				}
				
			}
		});
		
	}

	public void setVisible(boolean b) {
		frame.setVisible(true);
		
	}
}
