package yeni;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import dbase.MysqlDb;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ogrenci extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private int sinif1;
	private int sinif2;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogrenci frame = new ogrenci();
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
	public ogrenci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 0, 576, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdi = new JLabel("Adi");
		lblAdi.setBounds(41, 60, 22, 15);
		panel.add(lblAdi);
		
		textField = new JTextField();
		textField.setBounds(137, 58, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSoyadi = new JLabel("Soyadi");
		lblSoyadi.setBounds(285, 60, 48, 15);
		panel.add(lblSoyadi);
		
		JLabel lblKimlikNumarasi = new JLabel("Kimlik Numarasi");
		lblKimlikNumarasi.setBounds(39, 12, 156, 15);
		panel.add(lblKimlikNumarasi);
		
		textField_2 = new JTextField();
		textField_2.setBounds(234, 10, 180, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblBabaAdi = new JLabel("Baba Adi");
		lblBabaAdi.setBounds(41, 88, 70, 15);
		panel.add(lblBabaAdi);
		
		textField_1 = new JTextField();
		textField_1.setBounds(424, 58, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 86, 114, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(424, 86, 114, 19);
		panel.add(textField_4);
		
		JLabel lblAnneAdi = new JLabel("Anne Adi");
		lblAnneAdi.setBounds(285, 86, 70, 15);
		panel.add(lblAnneAdi);
		
		JLabel lblDogumYeri = new JLabel("Dogum Yeri");
		lblDogumYeri.setBounds(41, 115, 99, 15);
		panel.add(lblDogumYeri);
		
		JLabel lblDogumTarihi = new JLabel("Dogum Tarihi");
		lblDogumTarihi.setBounds(285, 115, 99, 15);
		panel.add(lblDogumTarihi);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(137, 113, 114, 19);
		panel.add(textField_5);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(424, 117, 114, 19);
		panel.add(formattedTextField);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 162, 576, 89);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSinif = new JLabel("Sinif");
		lblSinif.setBounds(46, 12, 70, 15);
		panel_2.add(lblSinif);
		
		JLabel lblSube = new JLabel("Sube");
		lblSube.setBounds(294, 12, 70, 15);
		panel_2.add(lblSube);
		
		JLabel lblOkulNumarasi = new JLabel("Okul Numarasi");
		lblOkulNumarasi.setBounds(46, 41, 122, 15);
		panel_2.add(lblOkulNumarasi);
		
		textField_6 = new JTextField();
		textField_6.setBounds(186, 39, 90, 19);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
	
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 263, 576, 263);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblToplamUcret = new JLabel("Toplam ucret");
		lblToplamUcret.setBounds(12, 35, 120, 15);
		panel_1.add(lblToplamUcret);
		
		textField_7 = new JTextField();
		textField_7.setBounds(135, 33, 114, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTaksitSayisi = new JLabel("Taksit Sayisi");
		lblTaksitSayisi.setBounds(285, 35, 101, 15);
		panel_1.add(lblTaksitSayisi);
		
		//int [] liste = {1,2,3,4,5,6,7,8};
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(430, 30, 120, 24);
		panel_1.add(comboBox_2);
		
		
		//for(int i=1;i<liste.length;i++) {
		for(int i=1;i<9;i++) {
			comboBox_2.addItem(i);
		}
		
		JTextArea textArea = new JTextArea();
		//textArea.setBackground(Color.CYAN);
		textArea.setBounds(12, 65, 200, 200);
		panel_1.add(textArea);
		
		

		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(351, 150, 117, 25);
		panel_1.add(btnKaydet);
		
		JLabel label = new JLabel("");
		label.setBounds(285, 213, 265, 15);
		panel_1.add(label);
		//textArea.setVisible(true);
		
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				textArea.selectAll();
				textArea.setText("");
//				textArea.removeAll();
				int ucret = Integer.parseInt(textField_7.getText());
				int taksit = Integer.parseInt(comboBox_2.getSelectedItem().toString());
				
				//System.out.print(ucret+" "+taksit);
				

			    
				float aylikTaksit = ucret/taksit;
				//taksit=taksit/2;
				for(int i=0;i<taksit;i++) {
					
					textArea.append((i+1)+"\t"+aylikTaksit+"\n");

				}
				
				
			}
		});
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(186, 7, 90, 24);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.setBounds(425, 7, 112, 24);
		panel_2.add(comboBox_1);
		MysqlDb sinif = new MysqlDb();
		for(int i=0;i<sinif.sinifSay();i++) {
			comboBox.addItem(sinif.sinifSec(i));
		}
		sinif1=Integer.parseInt(comboBox.getSelectedItem().toString());
		
		sinif2=sinif.subeSay(sinif1);
		
		for(int i=0;i<sinif2;i++) {
			comboBox_1.addItem(sinif.subeSec(i,sinif1));
		}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				comboBox_1.removeAllItems();
				sinif1=Integer.parseInt(comboBox.getSelectedItem().toString());
				
				sinif2=sinif.subeSay(sinif1);
				
				for(int j=0;j<sinif2;j++) {
					comboBox_1.addItem(sinif.subeSec(j,sinif1));
				}
				
			}
		});
		
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tcNo = textField_2.getText();
				String name = textField.getText();
				String Surname = textField_1.getText();
				String fName = textField_3.getText();
				String mName = textField_4.getText();
				String birtdPlace = textField_5.getText();
				String date = formattedTextField.getText();
				int sinifll = Integer.parseInt(comboBox.getSelectedItem().toString());
				int no = Integer.parseInt(textField_6.getText());
				int ucret = Integer.parseInt(textField_7.getText());
				
				String sube = comboBox_1.getSelectedItem().toString();
				int taksitSayisi = Integer.parseInt(comboBox_2.getSelectedItem().toString());
				
				MysqlDb ogrenci = new MysqlDb();
				boolean deger = ogrenci.kaydet(tcNo,name,Surname,fName,mName,birtdPlace,date,sinifll,sube,no,ucret,taksitSayisi);
				for(int i = 1;i<=taksitSayisi;i++) {
					ogrenci.ucretKaydet(tcNo, ucret/taksitSayisi, i );
				}
				if(deger) {
					label.setText("Kaydedildi");
				}
			}
		});
	}
}
