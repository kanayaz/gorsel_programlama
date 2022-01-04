package yeni;

import java.awt.BorderLayout;
import dbase.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ogrenciSil extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ogrenciSil frame = new ogrenciSil();
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
	public ogrenciSil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKimlikNumarasi = new JLabel("Kimlik Numarasi");
		lblKimlikNumarasi.setBounds(46, 33, 137, 15);
		contentPane.add(lblKimlikNumarasi);
		
		textField = new JTextField();
		textField.setBounds(206, 31, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnAktiflestir = new JRadioButton("Aktiflestir");

		buttonGroup.add(rdbtnAktiflestir);
		rdbtnAktiflestir.setBounds(34, 83, 149, 23);
		contentPane.add(rdbtnAktiflestir);
		
		JRadioButton rdbtnPasiflestir = new JRadioButton("Pasiflestir");
		buttonGroup.add(rdbtnPasiflestir);
		rdbtnPasiflestir.setBounds(206, 83, 149, 23);
		contentPane.add(rdbtnPasiflestir);
		
		JLabel label = new JLabel("");
		label.setBounds(46, 171, 274, 15);
		contentPane.add(label);
	//	boolean sonuc=false;
		rdbtnAktiflestir.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String tcNo= textField.getText();
				MysqlDb ogrenci = new MysqlDb();
				ogrenci.kayitSE(tcNo,true);
//				if(sonuc) {
//					label.setText("gerceklesti");
	//			}
			}
		});
		rdbtnPasiflestir.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				String tcNo= textField.getText();
				MysqlDb ogrenci = new MysqlDb();
				ogrenci.kayitSE(tcNo,false);
//				if(sonuc) {
//					label.setText("gerceklesti");
				}
//			}
		});

		
	}
}
