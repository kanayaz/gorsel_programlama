package yeni;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuuu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuuu frame = new menuuu();
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
	public menuuu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOgrenciKayit = new JButton("Ogrenci Kayit");
		btnOgrenciKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ogrenci ogrenciF =new ogrenci();
				ogrenciF.setVisible(true);
			}
		});
		btnOgrenciKayit.setBounds(135, 33, 158, 25);
		contentPane.add(btnOgrenciKayit);
		
		JButton btnKullaniciIslemleri = new JButton("Kullanici Islemleri");
		btnKullaniciIslemleri.setBounds(135, 70, 158, 25);
		contentPane.add(btnKullaniciIslemleri);
		btnKullaniciIslemleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kullanici kullan =new kullanici();
				kullan.setVisible(true);}});
		
		JButton btnUcretIslemleri = new JButton("Ucret Islemleri");
		btnUcretIslemleri.setBounds(135, 107, 158, 25);
		contentPane.add(btnUcretIslemleri);
		btnUcretIslemleri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ucret ogrenciUcret =new ucret();
				ogrenciUcret.setVisible(true);}});
		
		JButton btnOgrenciDurumDegistir = new JButton("Ogrenci durum degistir");
		btnOgrenciDurumDegistir.setBounds(135, 144, 158, 25);
		contentPane.add(btnOgrenciDurumDegistir);
		btnOgrenciDurumDegistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ogrenciSil ogrenciD =new ogrenciSil();
				ogrenciD.setVisible(true);
			}});}}


