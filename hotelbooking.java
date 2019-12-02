import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class hotelbooking {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T8;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JTextField T9;
	private JTextField T10;
	private JTextField T11;
	private JTextField T12;
	public String ss1,ss2,ss3;
	int f=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelbooking window = new hotelbooking();
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
	public hotelbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 1004, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 83, 318, 238);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel L2 = new JLabel("Chicken Burger");
		L2.setFont(new Font("Tahoma", Font.BOLD, 11));
		L2.setBounds(10, 11, 92, 24);
		panel.add(L2);
		
		T1 = new JTextField();
		T1.setBounds(141, 11, 136, 24);
		panel.add(T1);
		T1.setColumns(10);
		
		JLabel L3 = new JLabel("Chicken Burger Meal");
		L3.setFont(new Font("Tahoma", Font.BOLD, 11));
		L3.setBounds(10, 46, 122, 24);
		panel.add(L3);
		
		T2 = new JTextField();
		T2.setBounds(141, 46, 136, 24);
		panel.add(T2);
		T2.setColumns(10);
		
		JLabel L4 = new JLabel("Cheese Burger");
		L4.setFont(new Font("Tahoma", Font.BOLD, 11));
		L4.setBounds(10, 81, 108, 24);
		panel.add(L4);
		
		T3 = new JTextField();
		T3.setBounds(141, 81, 136, 24);
		panel.add(T3);
		T3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 124, 267, 2);
		panel.add(separator);
		
		JLabel L5 = new JLabel("Drink");
		L5.setFont(new Font("Tahoma", Font.BOLD, 18));
		L5.setBounds(10, 137, 81, 14);
		panel.add(L5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee", "Juice"}));
		comboBox.setBounds(10, 162, 108, 20);
		panel.add(comboBox);
		
		JLabel L6 = new JLabel("QTY");
		L6.setFont(new Font("Tahoma", Font.BOLD, 14));
		L6.setBounds(141, 134, 81, 24);
		panel.add(L6);
		
		T4 = new JTextField();
		T4.setBounds(141, 162, 136, 20);
		panel.add(T4);
		T4.setColumns(10);
		
		JRadioButton R1 = new JRadioButton("Home Delivery");
		R1.setFont(new Font("Tahoma", Font.BOLD, 11));
		R1.setBounds(9, 196, 109, 23);
		panel.add(R1);
		
		JRadioButton R2 = new JRadioButton("Tax");
		R2.setFont(new Font("Tahoma", Font.BOLD, 11));
		R2.setBounds(141, 196, 109, 23);
		panel.add(R2);
		
		JLabel L1 = new JLabel("Hotel Management System");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setFont(new Font("Tahoma", Font.BOLD, 19));
		L1.setBounds(176, 11, 439, 53);
		frame.getContentPane().add(L1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(332, 83, 209, 238);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel L7 = new JLabel("Currency Convertor");
		L7.setFont(new Font("Tahoma", Font.BOLD, 14));
		L7.setBounds(32, 11, 153, 32);
		panel_1.add(L7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"India", "America", "Qatar"}));
		comboBox_1.setBounds(32, 68, 135, 20);
		panel_1.add(comboBox_1);
		
		T8 = new JTextField();
		T8.setBounds(32, 118, 135, 20);
		panel_1.add(T8);
		T8.setColumns(10);
		
		JButton B1 = new JButton("Convert");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String country=(String)comboBox_1.getSelectedItem();
				String t=T11.getText();
				//float t1=Float.parseFloat(t);
				if(country.equals("India"))
				{
					T8.setText(t);
				}
				else if(country.equals("America"))
				{
					double a=Double.parseDouble(t);
					double b=a*0.014;
					String str1=String.valueOf(b);
					T8.setText(str1);
				}
				else if(country.equals("Qatar"))
				{
					double a=Double.parseDouble(t);
					double b=a*0.051;
					String str1=String.valueOf(b);
					T8.setText(str1);
				}
				
				
			}
		});
		B1.setBounds(20, 173, 82, 23);
		panel_1.add(B1);
		
		JButton B2 = new JButton("Close");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T8.setText(null);
				//System.exit(0);
			}
		});
		B2.setBounds(109, 173, 76, 23);
		panel_1.add(B2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(10, 332, 318, 124);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel L8 = new JLabel("Cost of Drink");
		L8.setFont(new Font("Tahoma", Font.BOLD, 11));
		L8.setBounds(10, 11, 109, 23);
		panel_2.add(L8);
		
		T5 = new JTextField();
		T5.setBounds(141, 12, 134, 20);
		panel_2.add(T5);
		T5.setColumns(10);
		
		JLabel L9 = new JLabel("Cost of Meal");
		L9.setFont(new Font("Tahoma", Font.BOLD, 11));
		L9.setBounds(10, 50, 109, 23);
		panel_2.add(L9);
		
		T6 = new JTextField();
		T6.setBounds(141, 51, 134, 20);
		panel_2.add(T6);
		T6.setColumns(10);
		
		JLabel L10 = new JLabel("Cost of delivery");
		L10.setFont(new Font("Tahoma", Font.BOLD, 11));
		L10.setBounds(10, 86, 109, 14);
		panel_2.add(L10);
		
		T7 = new JTextField();
		T7.setBounds(141, 83, 134, 20);
		panel_2.add(T7);
		T7.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(332, 332, 209, 124);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel L11 = new JLabel("Tax");
		L11.setFont(new Font("Tahoma", Font.BOLD, 11));
		L11.setBounds(10, 11, 53, 14);
		panel_3.add(L11);
		
		T9 = new JTextField();
		T9.setBounds(73, 8, 126, 20);
		panel_3.add(T9);
		T9.setColumns(10);
		
		JLabel L12 = new JLabel("Subtotal");
		L12.setFont(new Font("Tahoma", Font.BOLD, 11));
		L12.setBounds(10, 49, 53, 14);
		panel_3.add(L12);
		
		T10 = new JTextField();
		T10.setBounds(73, 46, 126, 20);
		panel_3.add(T10);
		T10.setColumns(10);
		
		JLabel L13 = new JLabel("Total");
		L13.setFont(new Font("Tahoma", Font.BOLD, 11));
		L13.setBounds(10, 79, 46, 14);
		panel_3.add(L13);
		
		T11 = new JTextField();
		T11.setBounds(73, 76, 126, 20);
		panel_3.add(T11);
		T11.setColumns(10);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(10, 470, 761, 49);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		JButton B3 = new JButton("Total");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=T1.getText();
				float f1=Float.parseFloat(s1);
				String s2=T2.getText();
				float f2=Float.parseFloat(s2);
				String s3=T3.getText();
				float f3=Float.parseFloat(s3);
				String drink=(String)comboBox.getSelectedItem();
				String qty=T4.getText();
				float fqty=Float.parseFloat(qty);
				float tdrink;
				float drinkprice=0,mealcost=0;
				float homecharge=0;
				float tax=0;
				if(drink.equals("Tea"))
				{
					drinkprice=10;
				}
				else if(drink.equals("Coffee"))
				{
					drinkprice=10;
				}
				else if(drink.equals("Juice"))
				{
					drinkprice=15;
				}
				tdrink=(float)drinkprice*fqty;
				String tdrink1=String.valueOf(tdrink);
				mealcost=(float)(f1*50)+(f2*70)+(f3*40);
				String mealc=String.valueOf(mealcost);
				T5.setText(tdrink1);
				T6.setText(mealc);
				if(R1.isSelected())
				{
					homecharge=100;
				}
				if(R2.isSelected())
				{
					tax=50;
				}
				
				String homecharge1=String.valueOf(homecharge);
				T7.setText(homecharge1);
				String tax1=String.valueOf(tax);
				T9.setText(tax1);
				float stotal=(float)(tdrink+mealcost+homecharge);
				String stotal1=String.valueOf(stotal);
				T10.setText(stotal1);
				float total=(float)(tax+stotal);
				String total1=String.valueOf(total);
				T11.setText(total1);
				
				
				
				
				
					
						
				
				
			}
		});
		B3.setFont(new Font("Tahoma", Font.BOLD, 11));
		B3.setBounds(75, 11, 89, 23);
		
		panel_4.add(B3);
		
		
		
		JButton B5 = new JButton("Reset");
		B5.addActionListener(new ActionListener() {
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
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				R1.setSelected(false);
				R2.setSelected(false);
				
			}
		});
		B5.setFont(new Font("Tahoma", Font.BOLD, 11));
		B5.setBounds(337, 11, 89, 23);
		panel_4.add(B5);
		
		JButton B6 = new JButton("Exit");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		B6.setFont(new Font("Tahoma", Font.BOLD, 11));
		B6.setBounds(468, 11, 89, 23);
		panel_4.add(B6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(551, 83, 376, 361);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 24, 356, 326);
		panel_5.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		T12 = new JTextField();
		T12.setBounds(32, 11, 209, 46);
		panel_7.add(T12);
		T12.setColumns(10);
		
		JButton B7 = new JButton("B");
		B7.setBounds(32, 78, 42, 34);
		panel_7.add(B7);
		
		JButton B8 = new JButton("C");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T12.setText("");
			}
		});
		B8.setBounds(91, 78, 42, 34);
		panel_7.add(B8);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(147, 78, 39, 34);
		panel_7.add(btnNewButton);
		
		JButton B10 = new JButton("+");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss1=T12.getText();
				 ss2=B10.getText();
					T12.setText(" ");
			}
		});
		B10.setBounds(196, 78, 47, 34);
		panel_7.add(B10);
		
		JButton B11 = new JButton("7");
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B11.getText()));
			}
		});
		B11.setBounds(32, 123, 42, 34);
		panel_7.add(B11);
		
		JButton B12 = new JButton("8");
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B12.getText()));
			
			}
		});
		B12.setBounds(91, 123, 42, 34);
		panel_7.add(B12);
		
		JButton B13 = new JButton("9");
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B13.getText()));
			}
		});
		B13.setBounds(147, 123, 42, 34);
		panel_7.add(B13);
		
		JButton B14 = new JButton("-");
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss1=T12.getText();
				 ss2=B14.getText();
					T12.setText(" ");
			}
		});
		B14.setBounds(196, 123, 47, 34);
		panel_7.add(B14);
		
		JButton B15 = new JButton("4");
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B15.getText()));
			}
		});
		B15.setBounds(32, 168, 42, 34);
		panel_7.add(B15);
		
		JButton B16 = new JButton("5");
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B16.getText()));
			}
		});
		B16.setBounds(91, 168, 42, 34);
		panel_7.add(B16);
		
		JButton B17 = new JButton("6");
		B17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B17.getText()));
			}
		});
		B17.setBounds(147, 168, 42, 34);
		panel_7.add(B17);
		
		JButton B18 = new JButton("*");
		B18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss1=T12.getText();
				 ss2=B18.getText();
					T12.setText(" ");
			}
		});
		B18.setBounds(196, 168, 47, 34);
		panel_7.add(B18);
		
		JButton B19 = new JButton("1");
		B19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B19.getText()));
			}
		});
		B19.setBounds(32, 213, 42, 34);
		panel_7.add(B19);
		
		JButton B20 = new JButton("2");
		B20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B20.getText()));
			}
		});
		B20.setBounds(91, 213, 42, 34);
		panel_7.add(B20);
		
		JButton B21 = new JButton("3");
		B21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
				}
				T12.setText(T12.getText().concat(B21.getText()));
			}
		});
		B21.setBounds(147, 213, 42, 34);
		panel_7.add(B21);
		
		JButton B22 = new JButton("/");
		B22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss1=T12.getText();
				 ss2=B22.getText();
					T12.setText(" ");
			}
		});
		B22.setBounds(196, 213, 47, 34);
		panel_7.add(B22);
		
		JButton B23 = new JButton("0");
		B23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					T12.setText(" ");
					f=0;
				}
				T12.setText(T12.getText().concat(B23.getText()));
			}
		});
		B23.setBounds(32, 258, 42, 29);
		panel_7.add(B23);
		
		JButton B24 = new JButton(".");
		B24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(f==1)
				{
					T12.setText(" ");
				}*/
				T12.setText(T12.getText().concat(B24.getText()));
			}
		});
		B24.setBounds(91, 258, 42, 29);
		panel_7.add(B24);
		
		JButton B25 = new JButton("New button");
		B25.setBounds(147, 258, 42, 29);
		panel_7.add(B25);
		
		JButton B26 = new JButton("=");
		B26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=1;
				
				ss3=T12.getText();
				
				float a=Float.parseFloat(ss1);
				float b=Float.parseFloat(ss3);
				T12.setText(" ");
				
				
				if(ss2.equals("+"))
				{
					float r=a+b;
					String r2=String.valueOf(r);
					T12.setText(r2);
					
				}
				if(ss2.equals("-"))
				{
					float r=a-b;
					String r2=String.valueOf(r);
					T12.setText(r2);
					
				}
				
				if(ss2.equals("*"))
				{
					float r=a*b;
					String r2=String.valueOf(r);
					T12.setText(r2);
					
				}
				if(ss2.equals("/"))
				{
					float r=a/b;
					String r2=String.valueOf(r);
					T12.setText(r2);
					
				}
				if(ss2.equals("%"))
				{
					float r=(a*b)/100;
					String r2=String.valueOf(r);
					T12.setText(r2);
			}
				
				
				
				
			}
		});
		
		B26.setBounds(196, 258, 47, 29);
		panel_7.add(B26);
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 331, 276);
		panel_6.add(textArea);
		
		JButton B4 = new JButton("Receipt");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int billno=101;
				textArea.append("item Details \n"
						+"Bill No:"+billno+"\n"
						+ "Item Name:\t Qty \t"+"UnitPrice\tPrice\n"
						+ "=============================================\n"
						+L2.getText()+"\t "+T1.getText()+"\t50\t"+Float.parseFloat(T1.getText())*50+"\n"
						+"Burger Meals  \t"+T2.getText()+"\t70\t"+Float.parseFloat(T2.getText())*70+"\n"
						+L4.getText()+" \t "+T3.getText()+"\t40\t"+Float.parseFloat(T3.getText())*40+"\n"
						+comboBox.getSelectedItem()+" \t"+T4.getText()+"\t10\t"+Float.parseFloat(T4.getText())*10+"\n"
						+ "=============================================\n"
						/*+L8.getText()+"\t\t "+T5.getText()+"\n"
						
						+L9.getText()+" \t \t"+T6.getText()+"\n"
						+L10.getText()+"\t\t "+T7.getText()+"\n"
						+ "======================================\n"*/
						+L11.getText()+"\t\t\t"+T9.getText()+"\n"
						+L12.getText()+"\t\t\t"+T10.getText()+"\n"
						+L13.getText()+"\t\t\t"+T11.getText()+"\n"
						
						);
						
						
			}
		});
		B4.setFont(new Font("Tahoma", Font.BOLD, 9));
		B4.setBounds(210, 11, 89, 23);
		panel_4.add(B4);
		
		
		
		
	}
}
