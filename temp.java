package temp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temp {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp window = new temp();
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
	public temp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel L1 = new JLabel("Degree");
		L1.setBounds(55, 62, 91, 27);
		frame.getContentPane().add(L1);
		
		T1 = new JTextField();
		T1.setBounds(156, 65, 141, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L2 = new JLabel("");
		L2.setBounds(78, 118, 165, 27);
		frame.getContentPane().add(L2);
		
		JButton B1 = new JButton("To celsius");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String d=T1.getText();
				
				float f=Float.parseFloat(d);
				//(f*9/5)+32;
				float f1=(float)(f-273.15);
				String str=String.valueOf(f1);
				L2.setText(str);
				
			}
		});
		B1.setBounds(57, 195, 89, 23);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("To fahrenheit");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String d1=T1.getText();
				
				float a1=Float.parseFloat(d1);
				//(a1-32)*5/9;
				float f2=(float)(a1-273.15) * 9/5 + 32;
				String str1=String.valueOf(f2);
				L2.setText(str1);
			}
		});
		B2.setBounds(208, 195, 89, 23);
		frame.getContentPane().add(B2);
	}

}
