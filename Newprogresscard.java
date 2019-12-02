import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Newprogresscard {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JTextField T8;
	private JTextField T9;
	private JTextField T10;
	private JTextField T11;
	private JTextField T12;
	private JTextField T13;
	private JTextField T14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newprogresscard window = new Newprogresscard();
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
	public Newprogresscard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 205));
		frame.setBounds(100, 100, 855, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(169, 169, 169));
		panel.setBorder(new TitledBorder(null, "Student Details", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, Color.RED));
		panel.setBounds(10, 11, 406, 362);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel L1 = new JLabel("Student_ID");
		L1.setFont(new Font("Tahoma", Font.BOLD, 11));
		L1.setBounds(21, 40, 65, 14);
		panel.add(L1);
		
		T1 = new JTextField();
		T1.setBounds(105, 37, 86, 20);
		panel.add(T1);
		T1.setColumns(10);
		
		JLabel L2 = new JLabel("First Name");
		L2.setFont(new Font("Tahoma", Font.BOLD, 11));
		L2.setBounds(21, 84, 65, 14);
		panel.add(L2);
		
		T2 = new JTextField();
		T2.setBounds(105, 81, 86, 20);
		panel.add(T2);
		T2.setColumns(10);
		
		JLabel L3 = new JLabel("Surname");
		L3.setFont(new Font("Tahoma", Font.BOLD, 11));
		L3.setBounds(21, 128, 58, 14);
		panel.add(L3);
		
		T3 = new JTextField();
		T3.setBounds(105, 125, 86, 20);
		panel.add(T3);
		T3.setColumns(10);
		
		JLabel L4 = new JLabel("Course Code");
		L4.setFont(new Font("Tahoma", Font.BOLD, 11));
		L4.setBounds(21, 165, 86, 14);
		panel.add(L4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 207, 181, 2);
		panel.add(separator);
		
		JLabel L5 = new JLabel("Total Score");
		L5.setFont(new Font("Tahoma", Font.BOLD, 11));
		L5.setBounds(21, 237, 65, 14);
		panel.add(L5);
		
		T4 = new JTextField();
		T4.setBounds(105, 234, 86, 20);
		panel.add(T4);
		T4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"111032E", "111032E", "111032E", "111032E"}));
		comboBox.setBounds(105, 162, 86, 20);
		panel.add(comboBox);
		
		JLabel L6 = new JLabel("Average");
		L6.setFont(new Font("Tahoma", Font.BOLD, 11));
		L6.setBounds(21, 278, 65, 14);
		panel.add(L6);
		
		T5 = new JTextField();
		T5.setBounds(105, 275, 86, 20);
		panel.add(T5);
		T5.setColumns(10);
		
		JLabel L7 = new JLabel("Ranking");
		L7.setFont(new Font("Tahoma", Font.BOLD, 11));
		L7.setBounds(21, 316, 46, 14);
		panel.add(L7);
		
		T6 = new JTextField();
		T6.setBounds(105, 313, 86, 20);
		panel.add(T6);
		T6.setColumns(10);
		
		JLabel L8 = new JLabel("Maths");
		L8.setFont(new Font("Tahoma", Font.BOLD, 11));
		L8.setBounds(234, 40, 58, 14);
		panel.add(L8);
		
		T7 = new JTextField();
		T7.setBounds(296, 37, 86, 20);
		panel.add(T7);
		T7.setColumns(10);
		
		JLabel L9 = new JLabel("English");
		L9.setFont(new Font("Tahoma", Font.BOLD, 11));
		L9.setBounds(234, 84, 46, 14);
		panel.add(L9);
		
		T8 = new JTextField();
		T8.setBounds(296, 81, 86, 20);
		panel.add(T8);
		T8.setColumns(10);
		
		JLabel L10 = new JLabel("Biology");
		L10.setFont(new Font("Tahoma", Font.BOLD, 11));
		L10.setBounds(234, 128, 46, 14);
		panel.add(L10);
		
		T9 = new JTextField();
		T9.setBounds(296, 125, 86, 20);
		panel.add(T9);
		T9.setColumns(10);
		
		JLabel L11 = new JLabel("Computer");
		L11.setFont(new Font("Tahoma", Font.BOLD, 11));
		L11.setBounds(234, 165, 58, 14);
		panel.add(L11);
		
		T10 = new JTextField();
		T10.setBounds(296, 162, 86, 20);
		panel.add(T10);
		T10.setColumns(10);
		
		JLabel L12 = new JLabel("Chemistry");
		L12.setFont(new Font("Tahoma", Font.BOLD, 11));
		L12.setBounds(234, 207, 58, 14);
		panel.add(L12);
		
		T11 = new JTextField();
		T11.setBounds(296, 204, 86, 20);
		panel.add(T11);
		T11.setColumns(10);
		
		JLabel L13 = new JLabel("Physics");
		L13.setFont(new Font("Tahoma", Font.BOLD, 11));
		L13.setBounds(234, 240, 46, 14);
		panel.add(L13);
		
		T12 = new JTextField();
		T12.setBounds(296, 237, 86, 20);
		panel.add(T12);
		T12.setColumns(10);
		
		JLabel L14 = new JLabel("Tamil");
		L14.setFont(new Font("Tahoma", Font.BOLD, 11));
		L14.setBounds(234, 278, 46, 14);
		panel.add(L14);
		
		T13 = new JTextField();
		T13.setBounds(296, 275, 86, 20);
		panel.add(T13);
		T13.setColumns(10);
		
		JLabel L15 = new JLabel("Malayalam");
		L15.setFont(new Font("Tahoma", Font.BOLD, 11));
		L15.setBounds(234, 316, 65, 14);
		panel.add(L15);
		
		T14 = new JTextField();
		T14.setBounds(296, 313, 86, 20);
		panel.add(T14);
		T14.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.RED));
		panel_1.setBounds(426, 11, 403, 374);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		JTextArea textarea = new JTextArea();
		textarea.setBounds(21, 23, 359, 287);
		panel_1.add(textarea);
		
		JButton B1 = new JButton("Clear");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textarea.setText("");
			}
			
		});
		B1.setBounds(118, 326, 89, 23);
		panel_1.add(B1);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_id", "Course Name", "Maths", "English", "Biology", "computer", "chemistry", "phycics", "Tamil", "Malayalam", "Total", "Average", "Rank"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 396, 819, 90);
		frame.getContentPane().add(table);
		
		JButton B2 = new JButton("Add Report");
		B2.setForeground(new Color(255, 0, 0));
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=T1.getText();
				String s2=T2.getText();
				String s3=T3.getText();
				String s4=(String)comboBox.getSelectedItem();//string values
				String s5=T4.getText();// Float values
				String s6=T5.getText();
				String s7=T6.getText();
				String s8=T7.getText();
				String s9=T8.getText();
				String s10=T9.getText();
				String s11=T10.getText();
				String s12=T11.getText();
				String s13=T12.getText();
				String s14=T13.getText();
				String s15=T13.getText();
				
	
				float maths=Float.parseFloat(s8);
				float eng=Float.parseFloat(s9);
				float bio=Float.parseFloat(s10);
				float comp=Float.parseFloat(s11);
				float che=Float.parseFloat(s12);
				float phy=Float.parseFloat(s13);
				float tamil=Float.parseFloat(s14);
				float mal=Float.parseFloat(s15);
				
				float total=(float)(maths+eng+bio+comp+che+phy+tamil+mal);
				float avg=(float)(total)/8;
				
				String rank="";
				if(total>700)
				{
					rank="1";
					
				}
				else if(total>=600 && total<700)
				{
					rank="2";
				}
				else if(total>=500 && total<600)
				{
				rank="3";
				}
				else if(total>=400 && total<500)
				{
				rank="4";
				}
				else if(total<400)
				{
				rank="fail";
				}
			
		
				
			String tot=String.valueOf(total);
			String av=String.valueOf(avg);
			String[] row={s1,s4,s8,s9,s10,s11,s12,s13,s14,s15,tot,av,rank};
			DefaultTableModel model1=(DefaultTableModel)table.getModel();
			model1.addRow(row);
			T4.setText(tot);
			T5.setText(av);
			T6.setText(rank);
			
				
				
			}
		});
		B2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		B2.setBounds(74, 497, 89, 23);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("Delete");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.removeRow(row);
			}
		});
		B3.setForeground(new Color(50, 205, 50));
		B3.setBounds(207, 497, 89, 23);
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("Show Report");
		B4.setForeground(new Color(138, 43, 226));
		B4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textarea.append("Student Record\n"
						+ "Student Name :\t\t"+T2.getText()+" "+T3.getText()+"\n"
						+ "======================================\n"
						+ "Math:\t\t" + T7.getText()
						+ "\nEnglish:\t\t" + T8.getText()
						+ "\nBiology:\t\t" + T9.getText()
						+ "\nComputer:\t\t" + T10.getText()
						+ "\nChemistry:\t\t" + T11.getText()
						+ "\nPysics:\t\t" + T12.getText()
						+ "\nTamil:\t\t" + T13.getText()
						+ "\nMalayalam:\t\t" + T14.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + T4.getText()
						+ "\nAverage:\t\t" + T5.getText()
						+ "\nRanking:\t\t" + T6.getText() + "\n");
						
						
				
			
			}
		});
		B4.setBounds(327, 497, 111, 23);
		frame.getContentPane().add(B4);
		
		JButton B5 = new JButton("Exit");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		B5.setForeground(new Color(255, 69, 0));
		B5.setBounds(484, 497, 89, 23);
		frame.getContentPane().add(B5);
		
		JButton B6 = new JButton("Reset");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				T5.setText("");
				T6.setText("");
				T7.setText("");
				T8.setText("");
				T9.setText("");
				T10.setText("");
				T11.setText("");
				T12.setText("");
				T13.setText("");
				T14.setText("");
			}
		});
		B6.setForeground(new Color(199, 21, 133));
		B6.setBounds(609, 497, 89, 23);
		frame.getContentPane().add(B6);
	}
}
