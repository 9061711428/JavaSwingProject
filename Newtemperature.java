import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Newtemperature {

	private JFrame frame;
	private JTextField T1;
	String str1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newtemperature window = new Newtemperature();
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
	public Newtemperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L7 = new JLabel("New label");
		L7.setBounds(182, 219, 46, 14);
		frame.getContentPane().add(L7);
		
		JLabel L1 = new JLabel("Input");
		L1.setBounds(119, 43, 46, 14);
		frame.getContentPane().add(L1);
		
		T1 = new JTextField();
		T1.setBounds(175, 40, 86, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L2 = new JLabel("Input Scale");
		L2.setBounds(46, 87, 81, 14);
		frame.getContentPane().add(L2);
		
		
		
		
		
		
		JRadioButton Rb1 = new JRadioButton("Celcius");
		Rb1.setBounds(45, 119, 109, 23);
		frame.getContentPane().add(Rb1);
		
		
		
		
		JRadioButton Rb2 = new JRadioButton("Fahrenheit");
		Rb2.setBounds(46, 145, 109, 23);
		frame.getContentPane().add(Rb2);
		
		
		JRadioButton Rb3 = new JRadioButton("kelvin");
		Rb3.setBounds(46, 176, 109, 23);
		frame.getContentPane().add(Rb3);
		ButtonGroup g=new ButtonGroup();
		g.add(Rb1);
		g.add(Rb2);
		g.add(Rb3);
		
		
		JLabel L3 = new JLabel("Output Scale");
		L3.setBounds(249, 87, 86, 14);
		frame.getContentPane().add(L3);
		
		JRadioButton Rb4 = new JRadioButton("Celcius");
		Rb4.setBounds(249, 119, 109, 23);
		frame.getContentPane().add(Rb4);
		
		
		JRadioButton Rb5 = new JRadioButton("Fahrenheit");
		Rb5.setBounds(249, 145, 109, 23);
		frame.getContentPane().add(Rb5);
		
		
		JRadioButton Rb6 = new JRadioButton("kelvin");
		Rb6.setBounds(249, 176, 109, 23);
		frame.getContentPane().add(Rb6);
		ButtonGroup g1=new ButtonGroup();
		g1.add(Rb4);
		g1.add(Rb5);
		g1.add(Rb6);
		
		//100°C + 273.15 = 373.15
		
		JLabel L4 = new JLabel("Output");
		L4.setBounds(108, 219, 46, 14);
		frame.getContentPane().add(L4);
		
		Rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=T1.getText();
				if(Rb4.isSelected()) {
					
				
				float a=Float.parseFloat(str1);
										//c to c
				L7.setText(str1);
				}
				//float a=Float.parseFloat(str1);
				
				else if(Rb5.isSelected()) {
					
				
					float a=Float.parseFloat(str1);                     //  c to f
					float res=(float)((1.8*a)+32);
					String str2=String.valueOf(res);
					L7.setText(str2);
				}
					
				else if(Rb6.isSelected()) {
					float a=Float.parseFloat(str1);
						float res1=(float)(a+273.15);//cel to kelvin
						String str21=String.valueOf(res1);
						L7.setText(str21);
				}
				
				 
					}
		});
		
		Rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str1=T1.getText();
			
				if(Rb4.isSelected()) {
					float a=Float.parseFloat(str1);
					float res1=(float)(((a-32)*5)/9);	
					String str2=String.valueOf(res1);//fahrenheit to celcius
				L7.setText(str2);
				}
				
				
				else if(Rb5.isSelected())
				{// f to f
					L7.setText(str1);
				
				}
				else if(Rb6.isSelected()) {
					float a=Float.parseFloat(str1);
					float res1=(float)(((a-32)*5)/9+273.15); //f to k
					String str21=String.valueOf(res1);
					L7.setText(str21);
			}
			
					}
		});
		
		Rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Rb4.isSelected()) {
					
					//kelvin to celcius
					float f1=Float.parseFloat(str1);
					float res1=(float)(f1-273.15); // k to c
					String str2=String.valueOf(res1);
					L7.setText(str2);
				}
				else if(Rb5.isSelected()) {
					float f1=Float.parseFloat(str1);
											
					float res=(float)(((f1-273.15)*9)/5)+32;//k to f
					String str2=String.valueOf(res);
					L7.setText(str2); 
					
				
				}
				else 
					{if(Rb6.isSelected()) {
					
					//k to 
					L7.setText(str1);
					}
					
			}
				
			
					}
		});
		
		Rb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				String str1=T1.getText();
				
				
				if(Rb1.isSelected()) {
					L7.setText(str1);
				}
					else if(Rb2.isSelected()) {
						float f1=Float.parseFloat(str1);
						float res1=(float)(((f1-32)*5)/9);
						String str21=String.valueOf(res1);
						L7.setText(str21);
			}
					else if(Rb3.isSelected())
					{
						float f1=Float.parseFloat(str1);
						float res1=(float)(f1-273.15);// c to k
						String str21=String.valueOf(res1);
						L7.setText(str21);
					}
				 
					}
		});
		
		Rb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str1=T1.getText();
				if(Rb1.isSelected()) {
					float f=Float.parseFloat(str1);
					float res=(float)((1.8*f)+32);
					String str21=String.valueOf(res);
					L7.setText(str21);
				}
					else if(Rb2.isSelected()) {
						
						L7.setText(str1);
			}
					else if(Rb3.isSelected()) {
					float f=Float.parseFloat(str1);
					float res=(float)(((f-273.15)*9)/5)+32;//k to f
					String str21=String.valueOf(res);
					L7.setText(str21);
				}
					
				}
			});
		
		Rb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String str1=T1.getText();
			L7.setText(str1);	
			if(Rb1.isSelected()) {
				
				float f=Float.parseFloat(str1);
				float res1=(float)(f+273.15);
				String str21=String.valueOf(res1);//k to c
				L7.setText(str21);
			}
				else if(Rb2.isSelected()) {
				
					float f1=Float.parseFloat(str1);
					float res1=(float)(((f1-273.15)*9)/5)+32;//k to f
					String str21=String.valueOf(res1);
					L7.setText(str21);
		}
				else if(Rb2.isSelected()) {
					
					
					
					L7.setText(str1);
		}
				
				
			}
		});
		
		
		
		
		
		
	}
}
