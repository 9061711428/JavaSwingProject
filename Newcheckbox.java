import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Newcheckbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newcheckbox window = new Newcheckbox();
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
	public Newcheckbox() {
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
		JLabel L1 = new JLabel("New label");
		L1.setBounds(122, 171, 143, 23);
		frame.getContentPane().add(L1);
		
		JCheckBox checkb1 = new JCheckBox("C++");
		checkb1.setBounds(121, 75, 97, 23);
		frame.getContentPane().add(checkb1);
		checkb1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
					{
				L1.setText("c++ "+(e.getStateChange()==1 ?
						"checked" : "unchecked"));
						
					}
		});
		
		
		
		JCheckBox Checkb2 = new JCheckBox("Java");
		Checkb2.setBounds(121, 113, 97, 23);
		frame.getContentPane().add(Checkb2);
		Checkb2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e)
					{
				L1.setText("java "+(e.getStateChange()==1 ?
						"checked" : "unchecked"));
						
					}
		});
		
		
	}
}
