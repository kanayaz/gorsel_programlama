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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sifremiUnuttum extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnCevapla;
	private JLabel sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sifremiUnuttum frame = new sifremiUnuttum();
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
	public sifremiUnuttum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKullaniciAdi = new JLabel("Kullanici Adi");
		lblKullaniciAdi.setBounds(12, 12, 115, 15);
		contentPane.add(lblKullaniciAdi);
		

		
		textField = new JTextField();
		textField.setBounds(131, 10, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSoruyuGetir = new JButton("Soruyu Getir");
		
		btnSoruyuGetir.setBounds(257, 7, 171, 25);
		contentPane.add(btnSoruyuGetir);
		
		sifre = new JLabel("");
		sifre.setBounds(12, 230, 416, 15);
		contentPane.add(sifre);
		
		
		

		
		btnSoruyuGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1 = new JTextField();
				textField_1.setBounds(131, 170, 114, 19);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
				textField_1.setVisible(true);;
				btnCevapla = new JButton("Cevapla");
				btnCevapla.setBounds(274, 167, 117, 25);
				btnCevapla.setVisible(true);
				contentPane.add(btnCevapla);
				JLabel soru = new JLabel();
				soru.setBounds(139, 82, 235, 15);
				contentPane.add(soru);
				
				String userName=textField.getText();
				MysqlDb gSoru=new MysqlDb();
				String gelenSoru=gSoru.gizliSoru(userName);
				soru.setText("Gizli sorunuz: "+gelenSoru);



				

				btnCevapla.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String cevap = textField_1.getText();
						sifre = new JLabel("");
						sifre.setBounds(12, 230, 416, 15);
						contentPane.add(sifre);
						if(cevap.equalsIgnoreCase(gSoru.gizliCevap(userName))){
							sifreOlustur yeniSifre = new sifreOlustur();
							yeniSifre.setVisible(true);
							contentPane.setVisible(false);
							
							
						}
						else {
							sifre.setText("Gizli Cevabiniz hatali");
						}
					}
				});
				
			}
		});
	}
}
