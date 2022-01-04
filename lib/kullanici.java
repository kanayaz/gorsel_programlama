package yeni;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbase.MysqlDb;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class kullanici extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kullanici frame = new kullanici();
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
	public kullanici() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 0, 416, 258);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("ekle", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblAdi = new JLabel("Adi");
		lblAdi.setBounds(12, 12, 70, 15);
		panel.add(lblAdi);
		
		JLabel lblSoyadi = new JLabel("Soyadi");
		lblSoyadi.setBounds(12, 32, 70, 15);
		panel.add(lblSoyadi);
		
		JLabel lblKullaniciAdi = new JLabel("Kullanici Adi");
		lblKullaniciAdi.setBounds(12, 59, 99, 15);
		panel.add(lblKullaniciAdi);
		
		JLabel lblGizliSoru = new JLabel("Gizli Soru");
		lblGizliSoru.setBounds(12, 86, 70, 15);
		panel.add(lblGizliSoru);
		
		JLabel lblGizliCevap = new JLabel("Gizli Cevap");
		lblGizliCevap.setBounds(12, 113, 99, 15);
		panel.add(lblGizliCevap);
		
		textField = new JTextField();
		textField.setBounds(135, 10, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 30, 114, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 57, 114, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 84, 114, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 111, 114, 19);
		panel.add(textField_4);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MysqlDb kullanici =new MysqlDb();
				String name= textField.getText();
				String sName= textField_1.getText();
				String kName= textField_2.getText();
				String gSoru= textField_3.getText();
				String gCevap= textField_4.getText();
				String sifre=textField_5.getText();
				
				
				kullanici.olustur(name,sName,kName,sifre,gSoru,gCevap);
			}
		});
		btnEkle.setBounds(135, 142, 117, 25);
		panel.add(btnEkle);
		
		textField_5 = new JTextField();
		textField_5.setBounds(285, 57, 114, 19);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("sil", null, panel1, null);
		
		JLabel lblKullaniciAdi1 = new JLabel("Kullanici Adi");
		lblKullaniciAdi1.setBounds(12, 59, 99, 15);
		panel1.add(lblKullaniciAdi1);
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(135, 10, 114, 19);
		panel1.add(textField1);
		textField1.setColumns(10);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MysqlDb kullanici =new MysqlDb();
				String kName= textField_2.getText();
				kullanici.sil(kName);
			}
		});
		panel1.add(btnSil);
		
	
	}
}
