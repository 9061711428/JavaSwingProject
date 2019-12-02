import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculatar {

	private JFrame frame;
	private JTextField T1;
	public String s1,s2,s3;
	int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatar window = new Calculatar();
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
	public Calculatar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		T1 = new JTextField();
		T1.setBounds(10, 25, 485, 48);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JButton B1 = new JButton("9");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B1.getText()));
			}
		});
		B1.setBounds(264, 106, 47, 23);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("8");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B2.getText()));
			
			}
		});
		B2.setBounds(321, 106, 47, 23);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("7");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B3.getText()));
			}
		});
		B3.setBounds(386, 106, 47, 23);
		frame.getContentPane().add(B3);
		
		JButton B4 = new JButton("/");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B4.getText();
					T1.setText(" ");
			}
			
		});
		B4.setBounds(443, 106, 52, 23);
		frame.getContentPane().add(B4);
		
		JButton B5 = new JButton("4");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B5.getText()));
			}
		});
		B5.setBounds(264, 153, 47, 23);
		frame.getContentPane().add(B5);
		
		JButton B6 = new JButton("5");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B6.getText()));
			}
		});
		B6.setBounds(321, 153, 52, 23);
		frame.getContentPane().add(B6);
		
		JButton B7 = new JButton("6");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B7.getText()));
			}
			
		});
		B7.setBounds(386, 153, 47, 23);
		frame.getContentPane().add(B7);
		
		JButton B8 = new JButton("*");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B8.getText();
					T1.setText(" ");
			}
		});
		B8.setBounds(443, 153, 53, 23);
		frame.getContentPane().add(B8);
		
		JButton B9 = new JButton("1");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
					//f=0;
				}
				T1.setText(T1.getText().concat(B9.getText()));
			}
		});
		B9.setBounds(264, 203, 47, 23);
		frame.getContentPane().add(B9);
		
		JButton B10 = new JButton("2");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B10.getText()));
			}
		});
		B10.setBounds(321, 203, 52, 23);
		frame.getContentPane().add(B10);
		
		JButton B11 = new JButton("3");
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T1.setText(" ");
				}
				T1.setText(T1.getText().concat(B11.getText()));
			}
		});
		B11.setBounds(386, 203, 47, 23);
		frame.getContentPane().add(B11);
		
		JButton B12 = new JButton("-");
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B12.getText();
					T1.setText(" ");
			}
		});
		B12.setBounds(443, 203, 52, 23);
		frame.getContentPane().add(B12);
		
		JButton B13 = new JButton("0");
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(f==1)
				{
					T1.setText(" ");
					f=0;
				}
				
				T1.setText(T1.getText().concat(B13.getText()));
			}
		});
		B13.setBounds(264, 251, 47, 23);
		frame.getContentPane().add(B13);
		
		JButton B14 = new JButton(".");
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(f==1)
				{
					T1.setText(" ");
				}*/
				T1.setText(T1.getText().concat(B14.getText()));
			}
		});
		B14.setBounds(321, 251, 52, 23);
		frame.getContentPane().add(B14);
		
		JButton B15 = new JButton("=");
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				
				s3=T1.getText();
				
				float a=Float.parseFloat(s1);
				float b=Float.parseFloat(s3);
				T1.setText(" ");
				
				
				if(s2.equals("+"))
				{
					float r=a+b;
					String r2=String.valueOf(r);
					T1.setText(r2);
					
				}
				if(s2.equals("-"))
				{
					float r=a-b;
					String r2=String.valueOf(r);
					T1.setText(r2);
					
				}
				
				if(s2.equals("*"))
				{
					float r=a*b;
					String r2=String.valueOf(r);
					T1.setText(r2);
					
				}
				if(s2.equals("/"))
				{
					float r=a/b;
					String r2=String.valueOf(r);
					T1.setText(r2);
					
				}
				if(s2.equals("%"))
				{
					float r=(a*b)/100;
					String r2=String.valueOf(r);
					T1.setText(r2);
			}
				if(s2.equals("x^y"))
				{
					double r=Math.pow(a, b);
					String r2=String.valueOf(r);
					T1.setText(r2);
			}
				
			}
		});
		B15.setBounds(391, 251, 47, 23);
		frame.getContentPane().add(B15);
		
		JButton B16 = new JButton("+");
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
			 s2=B16.getText();
				T1.setText(" ");
			}
			
		});
		B16.setBounds(448, 251, 47, 23);
		frame.getContentPane().add(B16);
		
		JLabel label1 = new JLabel("Edit");
		label1.setBounds(25, 0, 46, 14);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("view");
		label2.setBounds(67, 0, 46, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Help");
		label3.setBounds(108, 0, 46, 14);
		frame.getContentPane().add(label3);
		
		JButton B17 = new JButton("sqrt");
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(T1.getText());
				T1.setText(String.valueOf(Math.sqrt(a)));
			}
		});
		B17.setBounds(22, 106, 63, 23);
		frame.getContentPane().add(B17);
		
		JLabel label4 = new JLabel("Scientific");
		label4.setBounds(39, 81, 115, 14);
		frame.getContentPane().add(label4);
		
		JLabel label5 = new JLabel("Standard");
		label5.setBounds(291, 81, 115, 14);
		frame.getContentPane().add(label5);
		
		JButton B18 = new JButton("1/x");
		B18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
						float r=Float.parseFloat(s1);
						
							float x=(float)1/r;
						String r2=String.valueOf(x);
						T1.setText(r2);
						
					//code 
					//T1.setText(" ");
			}
		});
		B18.setBounds(95, 106, 59, 23);
		frame.getContentPane().add(B18);
		
		JButton B19 = new JButton("sin");
		B19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s1=T1.getText();
				T1.setText("");
				float a=Float.parseFloat(s1);
				float sin=(float)Math.sin((a*Math.PI)/180);
				String r2=String.valueOf(sin);
				T1.setText(r2);
			}
		});
		B19.setBounds(167, 106, 64, 23);
		frame.getContentPane().add(B19);
		
		JButton B20 = new JButton("%");
		B20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B20.getText();//code 
					T1.setText(" ");
				
			}
		});
		B20.setBounds(22, 153, 63, 23);
		frame.getContentPane().add(B20);
		
		JButton B21 = new JButton("Exp");
		B21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				float x=Float.parseFloat(s1);
				float y=(float)Math.exp(x);
				s3=String.valueOf(y);
				T1.setText(s3);
			
			}
		});
		B21.setBounds(95, 153, 59, 23);
		frame.getContentPane().add(B21);
		
		JButton B22 = new JButton("cos");
		B22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s1=T1.getText();
				T1.setText("");
				float a=Float.parseFloat(s1);
				float cos=(float)Math.cos((a*Math.PI)/180);
				String r2=String.valueOf(cos);
				T1.setText(r2);
			}
		});
		B22.setBounds(168, 153, 63, 23);
		frame.getContentPane().add(B22);
		
		JButton B23 = new JButton("x^y");
		B23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				 s2=B23.getText();
					T1.setText(" ");
			}
		});
		B23.setBounds(22, 203, 63, 23);
		frame.getContentPane().add(B23);
		
		JButton B24 = new JButton("In");
		B24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a=Float.parseFloat(T1.getText());
				T1.setText(String.valueOf(Math.log(a)));
			}
		});
		B24.setBounds(95, 203, 63, 23);
		frame.getContentPane().add(B24);
		
		JButton B25 = new JButton("tan");
		B25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s1=T1.getText();
				T1.setText("");
				float a=Float.parseFloat(s1);
				float tan=(float)Math.tan((a*Math.PI)/180);
				
				String r2=String.valueOf(tan);
				T1.setText(r2);
			}
		});
		B25.setBounds(168, 203, 63, 23);
		frame.getContentPane().add(B25);
		
		JButton B26 = new JButton("x^2");
		B26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				float f=Float.parseFloat(s1);
				float x=(float)f*f;
				s3=String.valueOf(x);
				T1.setText(s3);
				
				
			}
		});
		B26.setBounds(25, 251, 60, 23);
		frame.getContentPane().add(B26);
		
		JButton B27 = new JButton("n!");
		B27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=T1.getText();
				float n=Float.parseFloat(s1);
				String f="1";
				float n1=Float.parseFloat(f);
				for(int i=1;i<=n;i++)
				{
				n1=n1*i;
			
				}
				s3=String.valueOf(n1);
				T1.setText(s3);
				
			}
		});
		B27.setBounds(95, 251, 59, 23);
		frame.getContentPane().add(B27);
		
		JButton B28 = new JButton("sec");
		B28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				s1=T1.getText();
				T1.setText("");
				float a=Float.parseFloat(s1);
				float cos=(float)Math.cos((a*Math.PI)/180);
				float res=(1/cos);
				String r2=String.valueOf(res);
				T1.setText(r2);
				
			}
		});
		B28.setBounds(168, 251, 63, 23);
		frame.getContentPane().add(B28);
	}
}
