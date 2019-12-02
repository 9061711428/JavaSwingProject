import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bmicalculation {

	private JFrame frame;
	private JTextField T3;
	private JTextField T4;
	private JTextField T2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmicalculation window = new Bmicalculation();
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
	public Bmicalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(154, 205, 50));
		panel.setForeground(new Color(0, 100, 0));
		panel.setBounds(0, 0, 617, 83);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Body Mass calculation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(0, 84, 617, 243);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel L1 = new JLabel("Height(m) :");
		L1.setFont(new Font("Tahoma", Font.BOLD, 11));
		L1.setBounds(57, 42, 82, 26);
		panel_1.add(L1);
		
		JLabel L2 = new JLabel("Weight(kg) :");
		L2.setFont(new Font("Tahoma", Font.BOLD, 11));
		L2.setBounds(57, 93, 87, 26);
		panel_1.add(L2);
		
		T3 = new JTextField();
		T3.setBounds(159, 96, 181, 20);
		panel_1.add(T3);
		T3.setColumns(10);
		
		JLabel L3 = new JLabel("BMI :");
		L3.setFont(new Font("Tahoma", Font.BOLD, 11));
		L3.setBounds(93, 151, 69, 14);
		panel_1.add(L3);
		
		T4 = new JTextField();
		T4.setBounds(162, 148, 111, 20);
		panel_1.add(T4);
		T4.setColumns(10);
		
		JLabel L4 = new JLabel("");
		L4.setFont(new Font("Tahoma", Font.BOLD, 11));
		L4.setBounds(364, 133, 138, 26);
		panel_1.add(L4);
		
		JButton B1 = new JButton("Calculate");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=T3.getText();
				String s2=T2.getText();
				float a=Float.parseFloat(s1);
				float b=Float.parseFloat(s2);
				float bmi=a/(b*b);
				String s3=String.valueOf(bmi);
				T4.setText(s3);

				if(bmi<18.5)
				{
					L4.setText("under weight");
					
				}
				else if(bmi>18.5 && bmi<24.9)
				{
					L4.setText("Normal weight");
					
				}
				else if(bmi>25 && bmi<29.9)
				{
					L4.setText("Over weight");
					
				}
				else
				{
					L4.setText("Obese");
				}
				}
				
				
			
			
		});
		B1.setBounds(91, 196, 89, 23);
		panel_1.add(B1);
		
		JButton B2 = new JButton("Clear");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T2.setText("");
				T3.setText("");
				T4.setText("");
			}
		});
		B2.setBounds(199, 196, 89, 23);
		panel_1.add(B2);
		
		JButton B3 = new JButton("Exit");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		B3.setBounds(320, 196, 89, 23);
		panel_1.add(B3);
		
		T2 = new JTextField();
		T2.setBounds(159, 45, 181, 20);
		panel_1.add(T2);
		T2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(154, 205, 50));
		panel_2.setBounds(0, 328, 617, 93);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under weight", "Normal weight", "Over weight", "obese"},
				{">18.5", "18.5 to 24.5", "25 to 29.9", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(20, 50, 587, 32);
		panel_2.add(table);
	}
}
