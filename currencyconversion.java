import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class currencyconversion {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currencyconversion window = new currencyconversion();
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
	public currencyconversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L1 = new JLabel("Currency converter");
		L1.setBounds(97, 22, 182, 25);
		frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("Input currency");
		L2.setBounds(61, 80, 97, 14);
		frame.getContentPane().add(L2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rupees", "Dollar", "Qatari rial"}));
		comboBox.setBounds(175, 77, 131, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel L4 = new JLabel("Output currency");
		L4.setBounds(61, 119, 86, 14);
		frame.getContentPane().add(L4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Rupees", "Dollar", "Qatari rial"}));
		comboBox_1.setBounds(175, 116, 131, 20);
		frame.getContentPane().add(comboBox_1);
		/*comboBox.setSelectedIndex(0);
		comboBox_1.setSelectedIndex(1);*/
		

		
		
		
		JLabel L5 = new JLabel("Amount");
		L5.setBounds(61, 160, 86, 14);
		frame.getContentPane().add(L5);
		
		textField = new JTextField();
		textField.setBounds(175, 157, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel L6 = new JLabel("Converted Amount");
		L6.setBounds(61, 198, 97, 14);
		frame.getContentPane().add(L6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 195, 131, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton B1 = new JButton("Convert");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=(String)comboBox.getSelectedItem();
				String s2=(String)comboBox_1.getSelectedItem();
				//Rupee to 
				String str=textField.getText();
				if(s1.equals("Rupees") && s2.equals("Rupees"))
				{
					textField_1.setText(str);
					
				}
				else if(s1.equals("Rupees") && s2.equals("Dollar"))
				{
					double a=Double.parseDouble(str);
					double b=a*0.014;
					String str1=String.valueOf(b);
					textField_1.setText(str1);
					
				}
				else if(s1.equals("Rupees") && s2.equals("Qatari rial"))
				{
					double a=Double.parseDouble(str);
					double b=a*0.051;
					String str1=String.valueOf(b);
					textField_1.setText(str1);
					
				}
				
				
				
				//Dollor to
			if(s1.equals("Dollar") && s2.equals("Rupees"))
				{
					double a=Double.parseDouble(str);
					double b=a*71.76;
					String str1=String.valueOf(b);
					textField_1.setText(str1);
					
				}
				
			else if(s1.equals("Dollar") && s2.equals("Dollar"))
			{
				
				textField_1.setText(str);
				
			}
			else if(s1.equals("Dollar") && s2.equals("Qatari rial"))
			{
				
				
					double a=Double.parseDouble(str);
					double b=a*3.64;
					String str1=String.valueOf(b);
					textField_1.setText(str1);
					
				}
				
				
			
			//Qatari to
				
				if(s1.equals("Qatari rial") && s2.equals("Rupees"))
				{
					double a=Double.parseDouble(str);
					double b=a*19.70;
					String str1=String.valueOf(b);
					textField_1.setText(str1);
					
				}
		
			else if(s1.equals("Qatari rial") && s2.equals("Dollar"))
			{
				double a=Double.parseDouble(str);
				double b=a*0.27;
				String str1=String.valueOf(b);
				textField_1.setText(str1);
				
			}
			else if(s1.equals("Qatari rial") && s2.equals("Qatari rial"))
			{
				
				textField_1.setText(str);
				
			}
			
				
				
			}
		});
		B1.setBounds(97, 250, 89, 23);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("Clear");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		B2.setBounds(233, 250, 89, 23);
		frame.getContentPane().add(B2);
		
	}
}
