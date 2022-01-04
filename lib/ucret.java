package yeni;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dbase.MysqlDb;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ucret extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ucret frame = new ucret();
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
	public ucret() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 12, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTcNo = new JLabel("TC no");
		lblTcNo.setBounds(37, 14, 70, 15);
		contentPane.add(lblTcNo);

		
		JLabel label = new JLabel("");
		label.setBounds(37, 41, 70, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(37, 59, 70, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(37, 76, 70, 15);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(37, 93, 70, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(37, 107, 70, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(37, 120, 70, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(37, 134, 70, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(37, 147, 70, 15);
		contentPane.add(label_7);
		
		JButton btnGetir_1 = new JButton("Getir");
		btnGetir_1.setBounds(295, 4, 117, 25);
		contentPane.add(btnGetir_1);
		
		
		btnGetir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tcno= textField_1.getText();
				MysqlDb ucret = new MysqlDb();
				for (int i =1;i<=8;i++) {
					int taksit = ucret.taksit(tcno,i);
					if(taksit!=0&&i==1) {
						label.setText(String.valueOf(taksit)+" TL");

					}
					if(taksit!=0&&i==2) {
						label_1.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==3) {
						label_2.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==4) {
						label_3.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==5) {
						label_4.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==6) {
						label_5.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==7) {
						label_6.setText(String.valueOf(taksit)+" TL");
					}
					if(taksit!=0&&i==8) {
						label_7.setText(String.valueOf(taksit)+" TL");
					}
				}
				
			}
		});

		
		
		
		
		
		
		
		
	}
}
