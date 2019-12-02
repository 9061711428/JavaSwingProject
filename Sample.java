import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Sample {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField password1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
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
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(64, 74, 115, 23);
		frame.getContentPane().add(lblUsername);
		
		JLabel L1 = new JLabel("");
		L1.setBounds(64, 221, 329, 30);
		frame.getContentPane().add(L1);
		
		textField = new JTextField();
		textField.setBounds(200, 74, 142, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		password1 = new JPasswordField();
		password1.setBounds(200, 127, 142, 23);
		frame.getContentPane().add(password1);
		
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String str1=textField.getText();
				@SuppressWarnings("deprecation")
				String str2=password1.getText();
	
			if(str1.equals("SUBI") && str2.equals("123"))
			{
				L1.setText("Login sucessfully");
			}
				else
				{
					L1.setText("Login unsuccessfully");	
			
			}
			
			}
		});
		btnNewButton.setBounds(183, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel = new JLabel("password");
		lblNewLabel.setBounds(64, 131, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}
}
