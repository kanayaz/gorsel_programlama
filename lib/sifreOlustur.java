package yeni;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbase.MysqlDb;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class sifreOlustur extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sifreOlustur frame = new sifreOlustur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sifreOlustur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSifreniz = new JLabel("Yeni Sifreniz");
		lblSifreniz.setBounds(12, 48, 128, 15);
		contentPane.add(lblSifreniz);
		
		JLabel lblSifreTekrari = new JLabel("Sifre Tekrari");
		lblSifreTekrari.setBounds(12, 82, 113, 15);
		contentPane.add(lblSifreTekrari);
		
		JButton btnSifremiDegistir = new JButton("Sifremi Degistir");
		
		
		btnSifremiDegistir.setBounds(12, 106, 231, 25);
		contentPane.add(btnSifremiDegistir);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 12, 114, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblKullaniciAdi = new JLabel("Kullanici Adi");
		lblKullaniciAdi.setBounds(12, 14, 113, 15);
		contentPane.add(lblKullaniciAdi);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(126, 46, 117, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(126, 80, 117, 19);
		contentPane.add(passwordField_1);
		
		JLabel label = new JLabel("");
		label.setBounds(22, 143, 221, 15);
		contentPane.add(label);
		
		btnSifremiDegistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pass = String.valueOf(passwordField.getPassword());
				String pass2 = String.valueOf(passwordField_1.getPassword());
				String userName = textField_2.getText();
				if(pass2.equals(pass)) {
					
					
					
					MysqlDb yeniSifre = new MysqlDb();
					yeniSifre.setP(userName,pass);

					giris yeniG = new giris();
					yeniG.setVisible(true);
					setVisible(false);
					dispose();
				}
				else {
					label.setText("Sifreler eslesmiyor.");
				}
			}
		});
	}
}
